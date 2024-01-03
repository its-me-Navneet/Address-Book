import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
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
    public static void createFile(String filepath)
    {
        try {
            Path path = Path.of(filepath);
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("Files created: " +filepath);
            } else {
                System.out.println("File Already Exists: " + filepath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String filepath, String data)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath,true))){
            writer.write(data);
            writer.newLine();
            System.out.println("Data Added");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void readFromFile(String filepath)
    {
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            while((line = reader.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {



        System.out.println("Hello and welcome to Address Book System !!");


        // adding some person
        Person p1 = new Person("Navneet","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101","Bihar") ;
        Person p2 = new Person("xyz","kumar","xyz@gmail.com","12345055","xyz","A.bad","824101","UP") ;

         String fileName = "AddressBook.txt" ;

         createFile(fileName) ;
         writeToFile(fileName , p1.toString());
        writeToFile(fileName ,  p2.toString());

        readFromFile(fileName);

    }
}