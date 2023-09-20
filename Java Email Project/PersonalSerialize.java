
import java.util.ArrayList;
import java.io.*;
import java.io.ObjectOutputStream;

public class PersonalSerialize{
    

    public static void serialize_start( ArrayList<PersonalMail> obj0) {
        try {
            FileOutputStream fileOut =new FileOutputStream("PersonalMail.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj0);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in PersonalMail.ser\n");
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static ArrayList<PersonalMail> deserialize_start() {
        ArrayList<PersonalMail> obj0 = new ArrayList<PersonalMail>();
        try {
            FileInputStream fileStream = new FileInputStream("PersonalMail.ser");
            ObjectInputStream os1 = new ObjectInputStream(fileStream);
            obj0 = (ArrayList) os1.readObject();
            os1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj0;
    }

    


}
