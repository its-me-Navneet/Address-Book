import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to Address Book System !!");

        System.out.println("********************************");
        Scanner sc = new Scanner(System.in) ;
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
        AddressBook addressBook = new AddressBook();
        addressBook.addPerson(p);

// Print the details of addressBook

        for(Map.Entry<String,Person> details : AddressBook.listOfAddress.entrySet()){

            Person curr = details.getValue() ;

            System.out.println(curr);

        }



    }
}