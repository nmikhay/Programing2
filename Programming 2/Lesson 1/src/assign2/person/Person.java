package assign2.person;

public class Person {
    public String name;
    public String address;
    public long phone;
    public String email;

    public Person(){

    }
    public Person(String name, String address, long phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "Name is "+ name +" they live in " +address+" can be reached by "+phone+" or their email "+email;
    }
}
