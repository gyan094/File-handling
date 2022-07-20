package File_handling;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File b = new File("C:\\Users\\praka\\OneDrive\\Desktop\\zz.txt");
            Scanner gy= new Scanner(b);
            while (gy.hasNextLine()) {
                String data = gy.nextLine();
                System.out.println(data);
            }
            gy.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
