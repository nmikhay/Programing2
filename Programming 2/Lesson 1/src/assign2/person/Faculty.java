package assign2.person;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String name, String address, long phone, String email, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return name + " is faculty with these office hours " + officeHours + " and their rank is " + rank;
    }
}
