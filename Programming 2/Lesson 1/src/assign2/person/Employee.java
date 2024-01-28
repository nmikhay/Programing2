package assign2.person;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    private String office;
    private double salary;
    private Date dateHired;


    public Employee() {
    }

    public Employee(String name, String address, long phone, String email, String office, double salary, Date dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return name + " Is an employee who works in " + office + " with the salary " + salary + " and date hired " + dateHired;
    }
}
