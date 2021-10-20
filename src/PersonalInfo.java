public class PersonalInfo{
    /*------------------variables-------------------*/
    private String name;
    private String phone_number;

    /*------------------constructors-------------------*/

    /**
     * Sets the person/student name and phone number for them
     * @param name name of student
     * @param phone_number phone number of student
     */
    public PersonalInfo(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;

    }
    /*------------------setters-------------------*/

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /*------------------getters-------------------*/

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }


    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
