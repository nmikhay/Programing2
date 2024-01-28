package Assgn5;

import java.util.Scanner;

import java.util.InputMismatchException;


public class SumOfTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        while(true) {
            System.out.print("Please enter two numbers: ");
            try {
                number1 = scanner.nextInt();
                number2 = scanner.nextInt();
                number3= number1+number2;

                break;
            }
            catch(InputMismatchException ex){
                System.out.printf("Wrong input ");
                scanner.nextLine();
            }

        }
        System.out.printf("The sum of your numbers is "+ number3);
    }
}





