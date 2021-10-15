import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Student{

    /*----------------Variables-------------------------*/
    private PersonalInfo p;
    private AcademicRecords a;

    /**
     * Constructor to set all Student info into variables
     * @param Input_file
     * @throws IOException
     */
    public Student(File Input_file) throws IOException {
        Scanner sc = new Scanner(Input_file);
        sc.nextLine();
        sc.useDelimiter(", ");

        p = new PersonalInfo(sc.next(),sc.nextLine());

        a = new AcademicRecords(sc.nextLine(),Integer.parseInt(sc.nextLine()));

        sc.useDelimiter(": ");
        //add courses student has along with the grade point
        for (int i = 0; i < a.getNumber_of_courses(); i++){
            a.add_course_and_grade(sc.next(), Double.parseDouble(sc.nextLine().substring(2)));
        }
        // calculate gpa for student
        a.calculate_GPA();

        a.setNumber_of_research_experiences(Integer.parseInt(sc.nextLine()));

        for (int i = 0; i < a.getNumber_of_research_experiences(); i++){
            a.add_research_experience(sc.next(), sc.nextLine().substring(2));
        }

        System.out.println(sc.nextLine());



    }
    public void write(String Output_file) throws IOException{

    }
    /*------------------Setters--------------------------*/


    /*------------------Getters--------------------------*/


}
