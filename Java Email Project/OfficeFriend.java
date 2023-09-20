
public class OfficeFriend extends RecepientSuperClass implements Birthday_Interface {
    public String position;
    public String birthday;

    public OfficeFriend(String status,String name,String mail,String position, String birthday){
        this.position = position;
        this.name_of_recepient = name;
        this.status = status;
        this.email_address = mail;
        this.birthday = birthday;

    }

    public void SendBirthdayMail(){
        SendEmailTLS.sendmail(this.email_address,"Birthday Wish","Wish you a Happy Birthday. Navinda");
    }
}