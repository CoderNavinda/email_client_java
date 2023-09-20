import java.io.Serializable;
public class GeneralMail extends MailClass implements Serializable{
    

    public GeneralMail(String recepient, String subject, String content, String date){
        this.recepient = recepient;
        this.content = content;
        this.subject = subject;
        this.date = date;
    }
}
