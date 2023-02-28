/*Write a program that includes a class representing contact information for
a person including their name and email address. This class should include a
 method for displaying the contact's name and email address. The program should
  also include a class for business contacts that extends the contact class and
  stores the contact's phone number. The business contact class should override
  the base class's method that displays the name and email address so that it
  displays the phone number in addition to the name and email address. Create
   instances of both classes to demonstrate functionality.*/

public class Main {
    public static void main(String[] args) {
        Contact contact1=new Contact("john","deer");
        BusinessContacts bContacts=new BusinessContacts("john","deer","1123336687");
        contact1.display();
        bContacts.display();

        System.out.println("Hello world!");


    }



}
class Contact{
    private String Email;
    private String Name;
    public void display(){
        System.out.println(this.getEmail()+" , "+this.getName());
    }

    public Contact(String email, String name) {
        Email = email;
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "contact{" +
                "Email='" + Email + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
class BusinessContacts extends Contact{
    private String phoneNumber;

    @Override
    public void display() {
        super.display();
        System.out.println(this.getPhoneNumber());
    }

    public BusinessContacts(String email, String name, String phoneNumber) {
        super(email, name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "businessContacts{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}