
import java.util.ArrayList;
import java.io.*;
import java.io.ObjectOutputStream;

public class General_serialize{
    

    public static void serialize_start( ArrayList<GeneralMail> obj0) {
        try {
            FileOutputStream fileOut =new FileOutputStream("GeneralMail.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj0);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in GeneralEmail.ser\n");
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static  ArrayList<GeneralMail> deserialize_start() {
        ArrayList<GeneralMail> obj0 = new ArrayList<GeneralMail>();
        try {
            FileInputStream fileStream = new FileInputStream("GeneralMail.ser");
            ObjectInputStream os1 = new ObjectInputStream(fileStream);
            obj0 = (ArrayList) os1.readObject();
            os1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj0;
    }

    


}
