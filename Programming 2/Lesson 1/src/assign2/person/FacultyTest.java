package assign2.person;

public class FacultyTest {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());

        Person student = new Student();
        System.out.println(student.toString());

        Person employee = new Employee();
        System.out.println(employee.toString());

        Person faculty = new Faculty();
        System.out.println(faculty.toString());

        Person staff = new Staff();
        System.out.println(staff.toString());


    }
}
