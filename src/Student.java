import java.io.File;
import java.io.FileWriter;
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

        p = new PersonalInfo(sc.next(),sc.nextLine().substring(2));

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

    /**
     * writes all info that was scanned from a single student into a single .txt file that is organized
     * @param Output_file file that will be written to witht he students info in it
     * @throws IOException if file error, an exception will be thrown
     */
    public void write(File Output_file) throws IOException{
        FileWriter writer = new FileWriter(Output_file);
        writer.write("Name: " + p.getName()+ "\n");
        writer.write("Phone Number: " + p.getPhone_number() + "\n\n");
        writer.write("Academic: \n");
        writer.write(a.getSchool() + ", GPA: " + a.getCalculated_GPA() + "\n");
        for (int i = 0; i < a.getNumber_of_courses(); i++){
            if (i == a.getNumber_of_courses()-1){
                writer.write(a.getCourse_title()[i] + ": " + a.getGrade_point()[i] + " ");
            }else {
                writer.write(a.getCourse_title()[i] + ": " + a.getGrade_point()[i] + ", ");
            }
        }
        writer.write("\n\n");
        writer.write("Researches: \n");
        for (int i = 0; i < a.getNumber_of_research_experiences(); i++){
            writer.write(a.getResearch_date()[i] + "\n");
            writer.write(a.getResearch_experiences()[i] + "\n");
        }

        writer.write("\nProjects: \n");
        for (int i = 0; i < project.getNumber_of_projects(); i++){
            writer.write(project.getProject_dates()[i] + "\n");
            writer.write(project.getProject_titles()[i] + "\n");
        }

        writer.write("\nCertificates: \n");
        for (int i = 0; i < c.getNumber_of_certificates(); i++){
            //writer.write();
        }
        writer.close();
    }
    /*------------------Setters--------------------------*/


    /*------------------Getters--------------------------*/


}
