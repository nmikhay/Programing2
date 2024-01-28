package assign2.person;

public class Student extends Person{
    private final String status1 = "Freshman";
    private final String status2 ="Sophomore";
    private final String status3 = "Junior";
    private final String status4 = "Senior";
    String status = status1;

    public Student(){
    }

    public Student(String name, String address, long phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String toString() {
        return "This person name is " + name + " and they are in their " +status + " year" ;
    }
}
