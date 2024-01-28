package session2;

public class Employee {
    private String employeeNumber;
    private String address;
    private double salaryPerHour = 50;
    private double hoursWorked;

    public Employee(String employeeNumber, String address, double hoursWorked){
        setEmployeeNumber(employeeNumber);
        setAddress(address);
        setHoursWorked(hoursWorked);
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if(!employeeNumber.isEmpty()){
            this.employeeNumber = employeeNumber;
        }
        else{
            //TODO
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHoursWorked(double hoursWorked) {
        if(hoursWorked > 1){
            this.hoursWorked = hoursWorked;
        }
    }

    private double calculateSalary(){
        return this.salaryPerHour * this.hoursWorked;
    }

    public void printSalary(){
        System.out.printf("The employee %s has %.2f$ for working %.2f hours", employeeNumber, calculateSalary(), hoursWorked);
    }
}
