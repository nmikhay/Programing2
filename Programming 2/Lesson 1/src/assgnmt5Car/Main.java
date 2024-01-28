//package assgnmt5Car;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//
//    static Scanner input = new Scanner(System.in);
//    static final String DATA_FILE = "carData.txt";
//
//    //TYPE SAFE
//    static ArrayList<Car> carsList = new ArrayList<>();
//
//    //readData from the file
//    public static void main(String[] args) {
////        readDataFromFile();
//        //forever -> while
//        //there are some choices
//        // System.out.print("\nEnter the appropriate number of choice: \n0. Exit \n1. Add a Car \n2. List all Cars (numbered) \n3. Modify a Car \n4. Delete a Car \n5. Compute and display statistics \n");
//
//        readDataFromFile();
//
//        while (true) {
//            try {
//                //I am getting value from user
//                System.out.print("\nEnter the appropriate number of choice: \n0. Exit \n1. Add a Car \n2. List all Cars (numbered) \n3. Modify a Car \n4. Delete a Car \n5. Compute and display statistics \n");
//                int userInput = input.nextInt();
//                //tricky things that can happen when you get value from terminal
//                input.nextLine();
//                switch (userInput) {
//                    case 0:
//                        saveDataIntoFile();
//                        System.out.println("Bye!");
//                        return;
//                    case 1:
//                        //add a car
//                        addCar();
//                        break;
//                    case 2:
//                        listAllCars();
//                        break;
//                    case 3:
//                        modifyCar();
//                        break;
//                    case 4:
//                        deleteCar();
//                        break;
//                    case 5:
//                        computeAndDisplayStatistics();
//                        break;
//                }
//            } catch (InputMismatchException exception) {
//                System.out.println("You need to enter a number between 0 and 5");
//                //print a message
//                input.nextLine();
//            }
//        }
//
//        // 0 -> saveDataToFile() exit
//        // 1 -> addCar()
//        // 2 -> listAllCars()
//        // 3 -> modifyCar()
//        // 4 -> deleteCar()
//        // 5 -> computeAndDisplayStatistics()
//    }
//
//    private static void readDataFromFile() {
//        try(Scanner reader = new Scanner(new File(DATA_FILE))){
//            while (reader.hasNextLine()){
//                String line = reader.nextLine();
//                String[] dataLine = line.split(";");
//
//                if(dataLine.length != 3){
//                    System.out.println("Error in reading the file");
//                    continue; // means do not throw exception and do not leave the loop just skip this element
//                }
//
//                String model = dataLine[0];
//                int year = Integer.parseInt(dataLine[1]);
//                double engineSize = Double.parseDouble(dataLine[2]);
//
//                carsList.add(new Car(model, year, engineSize));
//            }
//        }
//        catch (IOException e) {
//            System.out.println("there is an exception in reading/writing the data " + e.getMessage());
//        }
//    }
//
//    private static void saveDataIntoFile() {
//        if(!carsList.isEmpty()){
//            //save the data into your resource file
//            try(PrintWriter writer = new PrintWriter(new File(DATA_FILE))){
//                for(Car car : carsList){
//                    writer.println(car.toDataString());
//                }
//            } catch (IOException e) {
//                System.out.println("there is an exception in reading/writing the data " + e.getMessage());
//            }
//        }
//    }
//
//    private static void computeAndDisplayStatistics() {
//        if (carsList.isEmpty()) {
//            System.out.println("There are no cars in the system. please add a car");
//            return;
//        }
//
//        //The oldest car
//        Car oldestCar = carsList.get(0);
//        for(Car car : carsList){
//            if (oldestCar.getYearOfProd() > car.getYearOfProd()){
//                oldestCar = car;
//            }
//        }
//        System.out.println("The oldest car : " + oldestCar);
//
//        //The biggest engine size
//        Car carBiggestEngine = carsList.get(0);
////        for(Car car : carsList){
////            if (carBiggestEngine.getEngSizeL() <= car.getEngSizeL()){
////                carBiggestEngine = car;
////            }
////        }
//        for(int i=1; i< carsList.size() ; i++){
//            if(carBiggestEngine.getEngSizeL() <= carsList.get(i).getEngSizeL()){
//                carBiggestEngine = carsList.get(i);
//            }
//        }
//        System.out.println("The biggest engine size car : " + carBiggestEngine);
//
//        //the average age of the cars
//
//        //avg = sum of X / count of cars
//        //age = current year - yearOfprod
//        double sumOfAge = 0.0;
//        int curYear = Calendar.getInstance().get(Calendar.YEAR);
//
//        for(Car car: carsList){
//            sumOfAge += curYear - car.getYearOfProd();
//        }
//        double avg = sumOfAge / carsList.size();
//        System.out.printf("The average of the car age is %.2f \n", avg);
//    }
//
//    private static void deleteCar() {
//        if (carsList.isEmpty()) {
//            System.out.println("There are no cars in the system. please add a car");
//            return;
//        }
//        System.out.println("Please enter a car # to modify");
//        int carNum = input.nextInt();
//        input.nextLine();
//        if (!carsList.contains(carsList.get(carNum - 1))) {
//            System.out.println("the car does not exist");
//        } else {
//            carsList.remove(carNum - 1);
//            System.out.println("Car #" + carNum + " deleted");
//        }
//    }
//
//    private static void modifyCar() {
//        //check if there is any car
//        if (carsList.isEmpty()) {
//            System.out.println("There are no cars in the system. please add a car");
//            return;
//        }
//        try {
//            System.out.println("Please enter a car # to modify");
//            int carNum = input.nextInt();
//            input.nextLine();
//            //check if this object exist in that index
////            if(carNum > carsList.size() || carNum < 0)
//            if (!carsList.contains(carsList.get(carNum - 1))) {
//                System.out.println("the car does not exist");
//            } else {
//                //I get the new values and I will replace the new object into the old object
//                System.out.println("Enter the car Model: ");
//                String model = input.nextLine();
//                System.out.println("Enter the year of production : ");
//                int year = input.nextInt();
//                System.out.println("Enter the Engine size: ");
//                double engineSize = input.nextDouble();
//
//                Car oldCar = carsList.get(carNum - 1);
//                oldCar.setYearOfProd(year);
//                oldCar.setEngSizeL(engineSize);
//                oldCar.setMakeModel(model);
//
//                System.out.println(carsList.get(carNum - 1));
//            }
//        } catch (InputMismatchException | IllegalArgumentException | IndexOutOfBoundsException ex) {
//            System.out.println("Wrong input");
//        }
//    }
//
//    private static void listAllCars() {
//        //first check if any error can happen
//        if (carsList.isEmpty()) {
//            System.out.println("There are no cars in the system. please add a car");
//            return;
//        }
////        for (Car car : carsList) {
////            System.out.println(car);
////        }
//        for (int i = 0; i < carsList.size(); i++) {
//            System.out.printf("#%d %s %n", i + 1, carsList.get(i));
//        }
//    }
//
////    public static void readDataFromFile() {
////
////    }
//
//    static void addCar(){
//        //provide information of the car
//        static void addCar(){
//            try {
//                System.out.println("Enter the car Model: ");
//                String model = input.nextLine();
//                System.out.println("Enter the year of production : ");
//                int year = input.nextInt();
//                System.out.println("Enter the Engine size: ");
//                double engineSize = input.nextDouble();
//
//                Car car = new Car(model, year, engineSize);
//                carsList.add(car);
//            } catch (InputMismatchException exception) {
//                System.out.println("Please enter valid input " + exception.getMessage());
//            } catch (IllegalArgumentException exception) {
//                System.out.println(exception.getMessage());
//            }
//        }
//    }
//}
