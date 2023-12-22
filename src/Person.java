public class Person {
   private  String fName ;
   private String lName ;

   private String email ;
   private String pNo ;
   private String address ;
   private  String city ;
   private  String zip ;

    public Person(String fName, String lName, String email, String pNo, String address, String city, String zip) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.pNo = pNo;
        this.address = address;
        this.city = city;
        this.zip = zip;
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
}
