
import java.util.ArrayList;
import java.io.*;
import java.io.ObjectOutputStream;

public class OfficeFriendSerialize{
    

    public static void serialize_start( ArrayList<OfficeFriendMail> obj0) {
        try {
            FileOutputStream fileOut =new FileOutputStream("OfficeFriendMail.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj0);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in OfficeEmails.ser\n");
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static ArrayList<OfficeFriendMail> deserialize_start() {
        ArrayList<OfficeFriendMail> obj0 = new ArrayList<OfficeFriendMail>();
        try {
            FileInputStream fileStream = new FileInputStream("OfficeFriendMail.ser");
            ObjectInputStream os1 = new ObjectInputStream(fileStream);
            obj0 = (ArrayList) os1.readObject();
            os1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj0;
    }

    


}
