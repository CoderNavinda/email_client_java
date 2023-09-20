
public class Personal extends RecepientSuperClass implements Birthday_Interface {
    public String nickname;
    public String birthday;

    public Personal(String status,String name,String mail,String nickname, String birthday){
        this.status = status;
        this.nickname = nickname;
        this.name_of_recepient = name;
        this.email_address = mail;
        this.birthday = birthday;

    }

    public void SendBirthdayMail(){
        SendEmailTLS.sendmail(this.email_address,"Birthday Wish","hugs and love on your birthday. Navinda");
    }
}