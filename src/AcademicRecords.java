public class AcademicRecords {
    /*------------------variables-------------------*/
    private String school;
    private String[] course_title, research_date, research_experiences;
    private double[] grade_point;
    private int number_of_courses, number_of_research_experiences;
    private double calculated_GPA;
    private int index = 0;
    private int index_2 = 0;

    /*------------------constructors-------------------*/

    /**
     * Sets the school name and number of courses. Also allocates memory for the grade points and courses
     * @param school School name
     * @param number_of_courses how many courses are taken
     */
    public AcademicRecords(String school, int number_of_courses) {
        this.school = school;
        this.number_of_courses = number_of_courses;
        grade_point = new double[number_of_courses];
        course_title = new String[number_of_courses];
    }
    public AcademicRecords(int number_of_research_experiences) {
        this.number_of_research_experiences = number_of_research_experiences;
        research_experiences = new String[this.number_of_research_experiences];
    }

    /*----------------Functions-------------------------*/

    /**
     * Calculates GPA
     */
    public void calculate_GPA() {
        double sum = 0;
        for (int i = 0; i < number_of_courses; i++){
            sum += grade_point[i];
        }
        double d = sum / number_of_courses;
        calculated_GPA = Math.round(d*100.0)/100.0;
    }

    /**
     * Adds a single course with its given grade.
     * @param course course title
     * @param grade grade given
     */
    public void add_course_and_grade(String course, double grade){
        if (index < number_of_courses){
            course_title[index] = course;
            grade_point[index] = grade;
            index++;
        }

    }

    /**
     * Adds a research experience with given title and date
     * @param research_experiences research experience title or position
     * @param research_date date of participation
     */
    public void add_research_experience(String research_experiences, String research_date){
        this.research_experiences[index_2] = research_experiences;
        this.research_date[index_2] = research_date;
        index_2++;
    }
    /*------------------setters-------------------*/

    public void setSchool(String school) {
        this.school = school;
    }

    public void setNumber_of_courses(int number_of_courses) {
        this.number_of_courses = number_of_courses;
    }

    public void setNumber_of_research_experiences(int number_of_research_experiences) {
        this.number_of_research_experiences = number_of_research_experiences;
        research_experiences = new String[this.number_of_research_experiences];
        research_date = new String[this.number_of_research_experiences];
    }

    /*------------------getters-------------------*/

    public String getSchool() {
        return school;
    }

    public String[] getCourse_title() {
        return course_title;
    }

    public double[] getGrade_point() {
        return grade_point;
    }

    public int getNumber_of_courses() {
        return number_of_courses;
    }

    public double getCalculated_GPA() {
        return calculated_GPA;
    }

    public int getNumber_of_research_experiences() {
        return number_of_research_experiences;
    }

    public String[] getResearch_date() {
        return research_date;
    }

    public String[] getResearch_experiences() {
        return research_experiences;
    }
}
