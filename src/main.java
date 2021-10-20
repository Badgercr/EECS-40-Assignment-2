import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        // File object to scan from
        File file = new File("Input.txt");
        Scanner sc = new Scanner(file);
        // get the number of students that info will be output
        int num_of_students = sc.nextInt();
        // Student object with file that will be scanned
        Student s = new Student(file);
        // Loop to output each students file into txt
        for (int i = 0; i < num_of_students; i++){
            s.write(new File("Student No." + String.valueOf(i+1) +  ".txt"), i);
        }

    }
}
