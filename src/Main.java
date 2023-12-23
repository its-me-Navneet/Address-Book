import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to Address Book System !!");

        AddressBook addressBook = new AddressBook();
        // adding some person
        Person p1 = new Person("Navneet","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101") ;
        Person p2 = new Person("xyz","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101") ;

        addressBook.addPerson(p1);
        addressBook.addPerson(p2);


        System.out.println("********************************");
         int add =1 ;
        Scanner sc = new Scanner(System.in) ;
        while(add==1){

            Person p = new Person() ;
            System.out.println("Enter your first name ");
            p.setfName(sc.next());
            System.out.println("Enter your last name ");
            p.setlName(sc.next());
            System.out.println("Enter your email  ");
            p.setEmail(sc.next());
            System.out.println("Enter your Phone no ");
            p.setpNo(sc.next());
            System.out.println("Enter your Address ");
            p.setAddress(sc.next());
            System.out.println("Enter your City ");
            p.setCity(sc.next());
            System.out.println("Enter your ZIP ");
            p.setZip(sc.next());

//       Insert to  AddressBook database
            addressBook.addPerson(p);
            System.out.println("Add more person ?");
            add=sc.nextInt() ;
             sc.nextLine() ;
        }


// Print the details of addressBook
        addressBook.viewContacts();
// Edit the contact details of person

        System.out.println("Enter the name of person to edit");

        String name = sc.nextLine();

        if(addressBook.checkPerson(name)){
            Person editPersonn = new Person() ;
            System.out.println("Enter your first name ");
            editPersonn.setfName(sc.next());
            System.out.println("Enter your last name ");
            editPersonn.setlName(sc.next());
            System.out.println("Enter your email  ");
            editPersonn.setEmail(sc.next());
            System.out.println("Enter your Phone no ");
            editPersonn.setpNo(sc.next());
            System.out.println("Enter your Address ");
            editPersonn.setAddress(sc.next());
            System.out.println("Enter your City ");
            editPersonn.setCity(sc.next());
            System.out.println("Enter your ZIP ");
            editPersonn.setZip(sc.next());
            sc.nextLine() ;
            addressBook.addPerson(editPersonn);
            System.out.println(editPersonn);
        }
        else{
            System.out.println("No name such exist in our address book");

        }
        // Delete the contact of given person
        System.out.println("Enter full name to remove from address book ");
        String nameToDelete = sc.nextLine() ;
        addressBook.deleteTheContactDetails(nameToDelete);

    }
}