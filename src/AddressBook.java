import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class AddressBook {
   public static HashMap<String, Person> listOfAddress = new HashMap<>() ;

   public void addPerson(Person p){
        String name = p.getfName() +" "+ p.getlName();
        listOfAddress.put(name ,p) ;
   }

   public boolean checkPerson(String name){
       if(!listOfAddress.containsKey(name)){
          return false ;
       }
       return true ;
   }
   public void editPerson(Person p){
        String name = p.getfName() +" "+ p.getlName();
          listOfAddress.remove(name) ;
          listOfAddress.put(name,p) ;
       System.out.println("Successfully edited your details ");
   }

   public void viewContacts(){
       for(Map.Entry<String,Person> details : AddressBook.listOfAddress.entrySet()){

           Person curr = details.getValue() ;

           System.out.println(curr);

       }
   }
}
