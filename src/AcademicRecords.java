public class AcademicRecords {
    /*------------------variables-------------------*/
    private String school;
    private String course_title[], research_date[], research_experiences[];
    private double grade_point[];
    private int number_of_courses, number_of_research_experiences;
    private double calculated_GPA;
    private int index = 0;
    private int index_2 = 0;

    /*------------------constructors-------------------*/

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
        calculated_GPA = sum / number_of_courses;
    }

    /**
     * Adds a single course with its given grade.
     * @param course
     * @param grade
     */
    public void add_course_and_grade(String course, double grade){
        if (index < number_of_courses){
            course_title[index] = course;
            grade_point[index] = grade;
            index++;
        }

    }
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
