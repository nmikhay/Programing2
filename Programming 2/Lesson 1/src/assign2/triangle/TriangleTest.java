package assign2.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("PLease enter desired sides of your triangle ");
        Scanner input = new Scanner(System.in);
        double side1,side2,side3;
        side1= input.nextInt();
        side2= input.nextInt();
        side3= input.nextInt();

        System.out.println("Choose a colour for your triangle");
        String color;
        color = input.next();

        System.out.println("Is your triangle filled? true/false ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1,side2,side3);

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("The parameters of your triangle are " + triangle.toString());
        System.out.println("The area of you triangle is " + triangle.getArea());
        System.out.println("The perimeter of you triangle is " + triangle.getPerimeter());
        System.out.println("The color of you triangle is " + triangle.getColor());
        System.out.println("Your triangle is filled ---> " + triangle.isFilled());

    }
}
