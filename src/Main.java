import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static int cnt=0 ;
    static HashMap<String,Integer>stateCode = new HashMap<>() ;

     static int getCode(String state){

         if(!stateCode.containsKey(state)){
               cnt++ ;
              stateCode.put(state,cnt) ;
         }
         return stateCode.get(state) ;
     }

    public static void main(String[] args) {

        System.out.println("Hello and welcome to Address Book System !!");

        AddressBook addressBook[] = new AddressBook[28] ;
         addressBook[0] =new AddressBook();
        // adding some person
        Person p1 = new Person("Navneet","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101","Bihar") ;
        Person p2 = new Person("xyz","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101","UP") ;



        AddressBook.addPerson(p1);
        AddressBook.addPerson(p2);


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
            System.out.println("Enter your State");
            p.setState(sc.next());

//         Insert to  AddressBook database
             AddressBook.addPerson(p);

             System.out.println("Add more person ?");
              add=sc.nextInt() ;
             sc.nextLine() ;
        }





// Edit the contact details of person

        System.out.println("Enter the name of person along with email without space to edit");

        String name = sc.nextLine();

        if(AddressBook.checkPerson(name)){
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
            AddressBook.addPerson(editPersonn);
            System.out.println(editPersonn);
        }
        else{
            System.out.println("No name such exist in our address book");

        }
//        // Delete the contact of given person
        System.out.println("Enter full name and email without space to remove from address book ");
        String nameToDelete = sc.nextLine() ;
        AddressBook.deleteTheContactDetails(nameToDelete);
//  print the list of contact of whole directory
       AddressBook.viewAllStateAddressBook();

       // print the list of particular state

        AddressBook.printState("Bihar") ;

    }
}