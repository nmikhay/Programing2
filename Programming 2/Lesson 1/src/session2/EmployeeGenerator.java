package session2;

public class EmployeeGenerator {
    public static void main(String[] args) {
        Employee employee1 = new Employee("SR1999", "Montreal", 19);
        employee1.printSalary();

        System.out.println("\nI received the information of Employee with ID " + employee1.getEmployeeNumber());
    }
}

