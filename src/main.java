import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("Input.txt");
        Scanner sc = new Scanner(file);
        int num_of_students = sc.nextInt();


        for (int i = 0; i < num_of_students; i++){
            Student s = new Student(file);
        }

    }
}
