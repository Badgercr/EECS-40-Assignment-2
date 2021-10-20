import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student{


    /*----------------Variables-------------------------*/
    private final PersonalInfo[] p;
    private final AcademicRecords[] a;
    private final Projects[] project;
    private final Certificates[] c;

    /**
     * Constructor to set all Student info into variables
     * @param Input_file Takes in students information file that will be scanned
     * @throws IOException If file does not open
     */
    public Student(File Input_file) throws IOException {
        Scanner sc = new Scanner(Input_file);
        int number_of_students = sc.nextInt();
        // Allocating memory for variables with number of students
        p = new PersonalInfo[number_of_students];
        a = new AcademicRecords[number_of_students];
        project = new Projects[number_of_students];
        c = new Certificates[number_of_students];

        // Repeat same scanning process for how many students they are
        for (int s = 0; s < number_of_students; s++){
            sc.useDelimiter(", ");

            p[s] = new PersonalInfo(sc.next(),sc.nextLine().substring(2)); // Scans name and the phone number

            a[s] = new AcademicRecords(sc.nextLine(),Integer.parseInt(sc.nextLine())); // Scans school and number of courses

            sc.useDelimiter(": "); // Used to separate course and grade point


            for (int i = 0; i < a[s].getNumber_of_courses(); i++){
                a[s].add_course_and_grade(sc.next(), Double.parseDouble(sc.nextLine().substring(2))); // Add courses student has, along with the grade point
            }

            a[s].calculate_GPA(); // Calculate gpa for student

            a[s].setNumber_of_research_experiences(Integer.parseInt(sc.nextLine())); // Scans number of research experiences

            for (int i = 0; i < a[s].getNumber_of_research_experiences(); i++){
                a[s].add_research_experience(sc.next(), sc.nextLine().substring(2)); // Adds a research experience title with its dates to an array
            }

            project[s] = new Projects(Integer.parseInt(sc.nextLine())); // Scans how many number of projects

            for (int i = 0; i < project[s].getNumber_of_projects(); i++){
                project[s].add_project(sc.next(),sc.nextLine().substring(2)); // Adds a project title with its dates
            }

            c[s] = new Certificates(Integer.parseInt(sc.nextLine())); // Scans how many certificates for a single student

            for (int i = 0; i < c[s].getNumber_of_certificates(); i++){
                c[s].add_certificate(sc.next(), sc.nextLine().substring(2)); // Adds a certificate title and date to an array
            }

        }

    }

    /**
     * writes all info that was scanned from a single student into a single .txt file that is organized
     * @param Output_file file that will be written to with the student's info in it
     * @param index specifies which student to write file of
     * @throws IOException if file error, an exception will be thrown
     */
    public void write(File Output_file, int index) throws IOException{
        FileWriter writer = new FileWriter(Output_file);
        /*
        * The following is simply writing to he output file the information in which was scanned for a single student
        * */
        writer.write("Name: "  +  p[index].getName().replaceAll("[\n\r]", "") + "\n");
        writer.write("Phone Number: " + p[index].getPhone_number() + "\n\n");
        writer.write("Academic: \n");
        writer.write(a[index].getSchool() + ", GPA: " + a[index].getCalculated_GPA() + "\n");
        for (int i = 0; i < a[index].getNumber_of_courses(); i++){
            if (i == a[index].getNumber_of_courses()-1){
                writer.write(a[index].getCourse_title()[i] + ": " + a[index].getGrade_point()[i] + " ");
            }else {
                writer.write(a[index].getCourse_title()[i] + ": " + a[index].getGrade_point()[i] + ", ");
            }
        }
        writer.write("\n\n");
        writer.write("Researches: \n");
        for (int i = 0; i < a[index].getNumber_of_research_experiences(); i++){
            writer.write(a[index].getResearch_date()[i] + "\n");
            writer.write(a[index].getResearch_experiences()[i] + "\n");
        }
        writer.write("\nProjects: \n");
        for (int i = 0; i < project[index].getNumber_of_projects(); i++){
            writer.write(project[index].getProject_dates()[i] + "\n");
            writer.write(project[index].getProject_titles()[i] + "\n");
        }

        writer.write("\nCertificates: \n");
        for (int i = 0; i < c[index].getNumber_of_certificates(); i++){
            writer.write(c[index].getCertificate_dates()[i] + "\n");
            writer.write(c[index].getCertificate_titles()[i] + "\n");
        }
        writer.close();


    }
    /*------------------Setters--------------------------*/


    /*------------------Getters--------------------------*/


}
