package File_handling;
import java.io.*;
public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\praka\\OneDrive\\Desktop\\zz.txt");
           f.write("Files in Java might be tricky, but it is fun enough!");
            f.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
