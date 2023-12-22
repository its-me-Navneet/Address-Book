import java.util.HashMap;
import java.util.List;

public  class AddressBook {
   public static HashMap<String, Person> listOfAddress = new HashMap<>() ;

   public void addPerson(Person p){
        String name = p.getfName() + p.getlName();
        listOfAddress.put(name ,p) ;
   }
}
