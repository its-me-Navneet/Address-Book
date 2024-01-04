import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class AddressBook {

    private String name ;

   public static  HashMap<String, Person> listOfAddress = new HashMap<>() ;
   public static ArrayList<Person>[] personDetails = new ArrayList[28];


    public AddressBook(){

         for(int i = 0; i < 28; i++) {
             personDetails[i] = new ArrayList<>();
         }
     }

   public static void addPerson(Person p){
        String name = p.getfName() + p.getlName();
        int code = Main.getCode(p.getState())  ;
        if(personDetails[code].contains(p)) {
            System.out.println("already present ");
            return;
        }

        personDetails[code].add(p) ;
        listOfAddress.put(name ,p) ;
       System.out.println("Added successfully");
   }

   public static boolean checkPerson(String name){
       if(!listOfAddress.containsKey(name)){
          return false ;
       }
       return true ;
   }
   public static void editPerson(Person p){
        String name = p.getfName() + p.getlName()+p.getEmail();
        int code = Main.getCode(p.getState()) ;
          listOfAddress.remove(name) ;
          listOfAddress.put(name,p) ;
          personDetails[code].remove(p) ;
          personDetails[code].add(p) ;
       System.out.println("Successfully edited your details ");
   }

   public static void viewContacts(){
       for(Map.Entry<String,Person> details : AddressBook.listOfAddress.entrySet()){

           Person curr = details.getValue() ;

           System.out.println(curr);

       }
   }

   public static   void deleteTheContactDetails(String name){

       if(checkPerson(name)){
            Person p =listOfAddress.get(name) ;
           listOfAddress.remove(name) ;
           int code = Main.getCode(p.getState()) ;
           personDetails[code].remove(p) ;
           System.out.println("Removed successfully");
       }
       else{
           System.out.println("No user exist of such name");
       }
   }
   public static void  viewAllStateAddressBook(){

         for(int i=0;i<28;i++){
             if(personDetails[i].isEmpty()) {
                 System.out.println(personDetails[i].get(0).getState());
             }
              for(Person p : personDetails[i]){
                  System.out.println(p);
              }
         }
   }
   public  static  void printState(String state){

         int code = Main.getCode(state) ;

         for(Person p:personDetails[code]) {
             System.out.println(p);
         }
   }

    public static void searchByCityName(String s) {

        for(ArrayList<Person> arr : personDetails){

            for(Person p:arr){
                 if(p.getCity().equals(s)) {
                     System.out.println(p);
                 }
            }
        }

    }

    public static void searchByStateName(String state) {
        for(ArrayList<Person> arr : personDetails){

            for(Person p:arr){
                if(p.getState().equals(state)) {
                    System.out.println(p);
                }
            }
        }
    }

    public String getName() {
        return name;
    }


}
