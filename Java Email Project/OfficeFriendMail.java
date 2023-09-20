public class OfficeFriendMail extends MailClass {
    
    public String position;
    public String birthday; 
    
    
    
    
    
    
    
    public OfficeFriendMail(String recepient, String subject, String content,String date,String position, String birthday){
        this.recepient = recepient;
        this.content = content;
        this.subject = subject;
        this.date = date;
        this.position = position;
        this.birthday = birthday;
    }
}
