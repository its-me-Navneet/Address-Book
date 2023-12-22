import java.util.HashMap;
import java.util.List;

public  class AddressBook {
   public  HashMap<String, Person> addressBook = new HashMap<>() ;

   public void addPerson(Person p){
        String name = p.getfName() + p.getlName();
        addressBook.put(name ,p) ;
   }


}
