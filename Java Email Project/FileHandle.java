
import java.io.*;
import java.util.ArrayList;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;
public class FileHandle {
    static ArrayList<String> file_objects = new ArrayList<String>();
    public static void WriteFile(String entry) {
        try {
            FileWriter writer = new FileWriter("clientList.txt",true);         
            writer.write(entry);
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in FileHandle Class");
            
        }}
    public static ArrayList<String> ReadFile() {
        try {
            File myObj = new File("clientList.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              file_objects.add(data);
            }
            myReader.close();
           
          } catch (FileNotFoundException e) {
            e.printStackTrace();
          }
          return file_objects;
    }
}
