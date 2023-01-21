package customer;

public class Customer{
    public int custId;
    public String custName;
    public String type;
    public long phoneNumber;
    public String emailId;
    public String location;
    public String maritalStatus;
    public String gender;

    // public
    public void login()
    {
        System.out.println("Welcome "+custName);
        System.out.println("can login as "+type+" customer");
    }
    public void logOut(){
        System.out.println("Successfully logged out.");
    }
    public void changePhoneNumber(long newPhoneNumber){
        phoneNumber=newPhoneNumber;
        System.out.print("Phone number successfully changed.");
    }
    public void changeEmail(String newEmailId){
        emailId=newEmailId;
        System.out.print("Email id successfully changed.");
    }
}