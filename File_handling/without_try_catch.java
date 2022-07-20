package File_handling;

import java.io.File;
import java.io.IOException;

public class without_try_catch {


        public static void main(String[] args) throws IOException {
            File f=new File("C:\\Users\\praka\\OneDrive\\Desktop\\zz.txt");

                if(f.createNewFile()){
                    System.out.println("file Successfully create...");
                }else{
                    System.out.println("File already Exist..");
                }
        }
}
