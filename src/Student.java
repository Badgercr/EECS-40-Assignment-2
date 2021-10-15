import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Student{

    /*----------------Variables-------------------------*/
    private PersonalInfo p;
    private AcademicRecords a;
    private  Projects project;
    private Certificates c;

    /**
     * Constructor to set all Student info into variables
     * @param Input_file Takes in students information file that will be scanned
     * @throws IOException If file does not open
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

        project = new Projects(Integer.parseInt(sc.nextLine()));

        for (int i = 0; i < project.getNumber_of_projects(); i++){
            project.add_project(sc.next(),sc.nextLine().substring(2));
        }

        c = new Certificates(Integer.parseInt(sc.nextLine()));

        for (int i = 0; i < c.getNumber_of_certificates(); i++){
            c.add_certificate(sc.next(), sc.nextLine().substring(2));
        }


    }
    public void write(String Output_file) throws IOException{

    }
    /*------------------Setters--------------------------*/


    /*------------------Getters--------------------------*/


}
