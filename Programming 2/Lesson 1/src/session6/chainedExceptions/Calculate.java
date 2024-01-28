package session6.chainedExceptions;

public class Calculate {
    public static void main(String[] args) {
        double num1, num2;
        try {
            num1 = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter only digits. " + args[0] + " " + e.getMessage());
            return;
        }
        try {
            num2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter only digits." + e.getMessage());
            return;
        }

        switch (args[1]) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                try {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } catch (ArithmeticException e) {
                    System.out.println("num2 cannot be 0" + e.getMessage());
                }
                break;
        }
    }

}
