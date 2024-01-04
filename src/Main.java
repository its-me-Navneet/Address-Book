import java.util.HashMap;

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

        // adding some person
        Person p1 = new Person("Navneet","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101","Bihar") ;
        Person p2 = new Person("xyz","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101","UP") ;
        Person p3 = new Person("Navneet","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101","Bihar") ;

         AddressBook add = new AddressBook() ;

        AddressBook.addPerson(p1);
        AddressBook.addPerson(p2);
        AddressBook.addPerson(p3);

        AddressBook.searchByCityName("A.bad") ;
        AddressBook.searchByStateName("Bihar");
//
        AddressBook.countNoOfPersonByCity("A.bad") ;
        AddressBook.countNoOfPersonByState("Bihar") ;


         AddressBook.sort() ;

         AddressBook.displayAllConatct() ;

    }

}