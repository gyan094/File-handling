
package File_handling;
import java.io.*;

public class createFile {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\praka\\OneDrive\\Desktop\\gp.txt");
        try {
            if(f.createNewFile()){
                System.out.println("file Successfully create...");
            }else{
                System.out.println("File already Exist..");
            }
        }
        catch (IOException i){
            System.out.println("Exception Handling..");
        }
    }
}
