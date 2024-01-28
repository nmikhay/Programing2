package session6;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Pepaa", 4);

        //using methods
        try {
            person1.validatePerson(-1, "");
        }catch (ArithmeticException | IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }catch (Exception exc){
            System.out.println(exc.getMessage());
        }
        try {
            Person person2 = new Person("", 1);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("I am always here !!!");
        }


        try{
            int a = 1+1;
        }
        finally {
            System.out.println("I am again here !!!");
        }

    }

}
