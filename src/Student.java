import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student{


    public int getNumber_of_students() {
        return number_of_students;
    }

    /*----------------Variables-------------------------*/
    private PersonalInfo[] p = new PersonalInfo[3];
    private AcademicRecords[] a = new AcademicRecords[3];
    private  Projects[] project = new Projects[3];
    private Certificates[] c = new Certificates[3];
    private int number_of_students;

    /**
     * Constructor to set all Student info into variables
     * @param Input_file Takes in students information file that will be scanned
     * @throws IOException If file does not open
     */
    public Student(File Input_file) throws IOException {
        Scanner sc = new Scanner(Input_file);
        number_of_students = sc.nextInt();

        for (int s = 0; s < number_of_students; s++){
            sc.useDelimiter(", ");

            p[s] = new PersonalInfo(sc.next(),sc.nextLine().substring(2));

            a[s] = new AcademicRecords(sc.nextLine(),Integer.parseInt(sc.nextLine()));

            sc.useDelimiter(": ");
            //add courses student has along with the grade point
            for (int i = 0; i < a[s].getNumber_of_courses(); i++){
                a[s].add_course_and_grade(sc.next(), Double.parseDouble(sc.nextLine().substring(2)));
            }
            // calculate gpa for student
            a[s].calculate_GPA();

            a[s].setNumber_of_research_experiences(Integer.parseInt(sc.nextLine()));

            for (int i = 0; i < a[s].getNumber_of_research_experiences(); i++){
                a[s].add_research_experience(sc.next(), sc.nextLine().substring(2));
            }

            project[s] = new Projects(Integer.parseInt(sc.nextLine()));

            for (int i = 0; i < project[s].getNumber_of_projects(); i++){
                project[s].add_project(sc.next(),sc.nextLine().substring(2));
            }

            c[s] = new Certificates(Integer.parseInt(sc.nextLine()));

            for (int i = 0; i < c[s].getNumber_of_certificates(); i++){
                c[s].add_certificate(sc.next(), sc.nextLine().substring(2));
            }

        }

    }

    /**
     * writes all info that was scanned from a single student into a single .txt file that is organized
     * @param Output_file file that will be written to witht he students info in it
     * @throws IOException if file error, an exception will be thrown
     */
    public void write(File Output_file, int index) throws IOException{
        FileWriter writer = new FileWriter(Output_file);

        writer.write("Name: " + p[index].getName() + "\n");
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
