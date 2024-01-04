import java.util.Objects;

public class Person {
   private  String fName ;
   private String lName ;

   private String email ;
   private String pNo ;
   private String address ;
   private  String city ;
   private  String zip ;
   private String state ;

    public Person() {
    }

    public Person(String fName, String lName, String email, String pNo, String address, String city, String zip,String state) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.pNo = pNo;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", pNo='" + pNo + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName) && Objects.equals(email, person.email) && Objects.equals(pNo, person.pNo) && Objects.equals(address, person.address) && Objects.equals(city, person.city) && Objects.equals(zip, person.zip) && Objects.equals(state, person.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, email, pNo, address, city, zip, state);
    }
}
