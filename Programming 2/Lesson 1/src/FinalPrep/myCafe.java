package FinalPrep;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class CoffeeItems {
    private String name;
    private double price;

    public CoffeeItems(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
public class myCafe {

    public static void displayMenu(ArrayList<CoffeeItems> items) {
        System.out.println("MENU");
        System.out.println("*************");
        for (int i = 0; i < items.size(); i++) {
            CoffeeItems item = items.get(i);
            System.out.printf("%d. %s \t %.2f\n", i + 1, item.getName(), item.getPrice());
        }
        System.out.printf("%d. EXIT\n", items.size() + 1);
        System.out.println("**************");
        System.out.println("Enter your choice");

    }

    public static void completeTransaction(int choice, ArrayList<CoffeeItems> items) {
        CoffeeItems item = items.get(choice - 1);
        System.out.printf("Here is your %s coffee cost $ %.2f\n", item.getName(), item.getPrice());

    }

//    public static void readMenu (String fileName, ArrayList<CoffeeItems> items) {
//        try{
//            FileReader myRead = new FileReader(fileName);
//            BufferedReader bufferedReader = new BufferedReader(myRead);
//            String line;
//            while ((line = bufferedReader.readLine()) != null){
//                String tokens[] = line.split(",");
//                String name = tokens[0];
//                double price = Double.parseDouble(tokens[1]);
//                items.add(new CoffeeItems(name,price));
//            }
//            bufferedReader.close();
//        }
//        catch (IOException e){
//            System.out.println("Error - cannot read from file " + fileName);
//        }
//    }


    public static void main(String[] args) {
        int choice;
        ArrayList<CoffeeItems> coffeeItems = new ArrayList<CoffeeItems>();
//        readMenu("myMenu.txt", coffeeItems);
//        String DATA_FILE = "myMenu.txt";
//        int options[] = {1,2,3,4,5};
//        String menuItems[] = {"Cappuccino","Pumpkin Pie","Americano","Espresso","Exit"};
//        double prices[]={2.50,5.00,3.25,1.75};

        coffeeItems.add(new CoffeeItems("Cappuccino", 2.50));
        coffeeItems.add(new CoffeeItems("Pumpkin Pie", 5.00));
        coffeeItems.add(new CoffeeItems("Americano", 3.25));
        coffeeItems.add(new CoffeeItems("Espresso", 1.75));

        int EXIT = coffeeItems.size() + 1;

        displayMenu(coffeeItems);

        Scanner scanner = new Scanner(System.in);

        choice = scanner.nextInt();

        while (choice != EXIT) {
            //           if(choice==options[0]){
//                System.out.printf("%s coffee %.2f\n", menuItems[0],prices[0]);
//            } else if (choice==options[1]) {
//                System.out.printf("%s coffee %.2f\n", menuItems[1],prices[1]);
//            } else if (choice==options[2]) {
//                System.out.printf("%s coffee %.2f\n", menuItems[2],prices[2]);
//            }
//            else if(choice==options[3]){
//                System.out.printf("%s coffee %.2f\n", menuItems[3],prices[3]);
//            }

            completeTransaction(choice, coffeeItems);
            displayMenu(coffeeItems);
            choice = scanner.nextInt();

            System.out.println("Come back again!");
        }
    }
}


