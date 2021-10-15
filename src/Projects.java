public class Projects {
    /*------------------variables-------------------*/
    private int number_of_projects, index = 0;
    private String project_titles[], project_dates[];
    /*------------------constructors-------------------*/

    /**
     * Sets the number of projects and allocates memory for the project information
     * @param number_of_projects Sets how many projects they are
     */
    public Projects(int number_of_projects) {
        this.number_of_projects = number_of_projects;
        project_titles = new String[this.number_of_projects];
        project_dates = new String[this.number_of_projects];
    }
    /*------------------functions-------------------*/
    public void add_project(String project_title, String project_date){
        project_titles[index] = project_title;
        project_dates[index] = project_date;
        index++;
    }
    /*------------------setters-------------------*/

    public void setNumber_of_projects(int number_of_projects) {
        this.number_of_projects = number_of_projects;
        project_titles = new String[this.number_of_projects];
        project_dates = new String[this.number_of_projects];
    }

    public void setProject_titles(String[] project_titles) {
        this.project_titles = project_titles;
    }

    public void setProject_dates(String[] project_dates) {
        this.project_dates = project_dates;
    }
    /*------------------getters-------------------*/

    public int getNumber_of_projects() {
        return number_of_projects;
    }

    public String[] getProject_titles() {
        return project_titles;
    }

    public String[] getProject_dates() {
        return project_dates;
    }
}
