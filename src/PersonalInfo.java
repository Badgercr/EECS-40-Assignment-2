public class PersonalInfo{
    /*------------------variables-------------------*/
    private String name;
    private String phone_number;

    /*------------------constructors-------------------*/

    /**
     *
     * @param name
     * @param phone_number
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
