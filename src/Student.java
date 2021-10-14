import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    /*----------------Variables-------------------------*/
    private String name;

    /**
     * Constructor
     * @param Input_file
     * @throws IOException
     */
    public Student(File Input_file) throws IOException {
        Scanner sc = new Scanner(Input_file);
        name = sc.nextLine();
        System.out.println(name);

    }
    public void write(String Output_file) throws IOException{

    }
    /*------------------Setters--------------------------*/



    /*------------------Getters--------------------------*/


}
