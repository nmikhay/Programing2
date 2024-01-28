package Assgn5;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutBoundsException {
    public static void main(String[] args) {

        int[] randomNumbers = new int[100];
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(100);
        }
        try {
            System.out.printf("Enter a number 0-99 corresponding to an index position of a random number --> ");
            int positionIndex = Integer.parseInt(scanner.nextLine());
            System.out.println("A number found at index--> "+positionIndex+" is "+randomNumbers[positionIndex]);
        }
        catch(ArrayIndexOutOfBoundsException exp)
        {
            System.out.println("Out of bounds");
        }

    }
}
