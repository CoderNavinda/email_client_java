import java.io.Serializable;
public class PersonalMail extends MailClass implements Serializable {
    
    public String nickname;
    public String birthday; 
    
    
    
    
    
    
    
    public PersonalMail(String recepient, String subject, String content,String date,String nickname, String birthday){
        this.recepient = recepient;
        this.content = content;
        this.subject = subject;
        this.date = date;
        this.nickname = nickname;
        this.birthday = birthday;
    }
}
