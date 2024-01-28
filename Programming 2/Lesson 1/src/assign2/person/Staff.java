package assign2.person;

import java.util.Date;

public class Staff extends Employee {
    private String title;

    public Staff() {
    }

    public Staff(String name, String address, long phone, String email, String office, double salary, Date dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    public String toString() {
        return name + " is staff and their title is ";
    }

}
