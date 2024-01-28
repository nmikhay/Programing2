//package Aeroport;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//    static Scanner input = new Scanner(System.in);
//    static final String DATA_FILE = "portList.txt";
//    static ArrayList<Airport> portList = new ArrayList<>();
//
//
//    public static void main(String[] args) {
//        readDataFromFile();
//
//        ArrayList<Airoport> portList = new ArrayList<Airoport>();//I realize that my txt file isn't readable anfd had to use the ArrayList
//        portList.add(new Airoport("YUL", "Montreal", 45.4697842, -73.7554174, 1945 - 06 - 01));
//        portList.add(new Airoport("YYZ", "Toronto", 43.6777215, -79.6270084, 1922 - 03 - 22));
//        portList.add(new Airoport("JFK", "New York", 40.6413151, -73.7803278, 1911 - 10 - 11));
//
//        System.out.println("Here is the list of our ports" + portList);
//
//
//        while (true) {
//            try {
//                System.out.println("Welcome to Aero-ports system!! ");
//                System.out.println("\\Please choose from the following options: \\0. Exit \\1. Show all airports \\2. Find distance between two airports by codes (in Kilometers)) \\3. Add a new airport to the list. \\4. List airports from oldest to newest.\\n\"");
//                int choice = input.nextInt();
//            } catch (InputMismatchException exception) {
//                System.out.println("Your choice must be a digit 0-4");
//                input.nextLine();
//                case 0:
//                    System.out.println("Good bye");
//                    return;
//                case 1:
//                    showAllPorts();
//                    break;
//                case 2:
//                    findDistance();
//                    break;
//                case 3:
//                    addNewAirport();
//                case 4:
//                    listFromOldestToNewest();
//                    break;
//
//            } catch (InputMismatchException exception) {
//                System.out.println("You need to enter a number between 0 and 5");
//                //print a message
//                input.nextLine();
//
//            }
//
//
//            private static void readDataFromFile () {
//                try (Scanner reader = new Scanner(new File(DATA_FILE))) {
//                    while (reader.hasNextLine()) {
//                        String line = reader.nextLine();
//                        String[] dataLine = line.split(";");
//
//                        if (dataLine.length != 3) {
//                            System.out.println("Error in reading the file");
//                            continue;
//                        }
//
//                        String code = dataLine[0];
//                        String city = dataLine[1];
//                        double latitude = Double.parseDouble(dataLine[2]);
//                        double longitude = Double.parseDouble(dataLine[3]);
//                        Date openingDate = (dataLine[4]);
//                    }
//                } catch (IOException e) {
//                    System.out.println("there is an exception in reading/writing the data " + e.getMessage());
//                }
//            }
//
//            public static void showAllPorts (ArrayList < Airoport > portList) {
//                if (portList.isEmpty()) {
//                    System.out.println("There are no airports in the system; Please add an airport");
//                    return;
//                }
//
//                for (int i = 0; i < portList.size(); i++) {
//                    System.out.printf("#%d %s %n", i + 1, portList.get(i));
//                }
//            }
//            public static void findDistance ( double latitude1, double longitude1, double latitude2,double longitude2){
//                if ((latitude1 == latitude1) && (longitude1 == longitude1)) {
//                    return 0;
//                }
//                else {
//                    double theta = longitude1 - longitude1;
//                    double distance = Math.sin(Math.toRadians(latitude1)) * Math.sin(Math.toRadians(latitude2)) + Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(theta));
//                    distance = Math.acos(distance);
//                    distance = Math.toDegrees(distance);
//                    distance = distance * 60 * 1.1515;
//                    distance = distance * 1.609344;
//
//                    return (findDistance);
//
//                    System.out.println("The distance between two AIrports is"+distance);
//                }
//            }
//
//
//        }
//
//        static void addNewAirport (String[]args){
//            try {
//                System.out.println("Enter the airport codel: ");
//                String code = input.nextLine();
//                System.out.println("Enter the city location : ");
//                String city = input.nextLine();
//                System.out.println("Enter the latitude position: ");
//                double latitude = input.nextDouble();
//                System.out.println("Enter the longitude position: ");
//                double longitude = input.nextDouble();
//
//                Airport airport = new portList(code, city, latitude, longitude, openingDate);
//                portList.add(portList);
//            } catch (InputMismatchException exception) {
//                System.out.println("Please enter valid input " + exception.getMessage());
//            } catch (IllegalArgumentException exception) {
//                System.out.println(exception.getMessage());
//            }
//        }
//
//        public static void listFromOldestToNewest (String[]args){
//            if (portList.isEmpty()) {
//                System.out.println("There are no airports in the system; Please add a new airport");
//                return;
//            }
//
//            //The oldest car
//            Airport oldestAirport = portList.get(0);
//            for (Airport airport : portList) {
//                if (oldestAirport.getOpeningDate() > airport.getOpeningDate()) {
//                    oldestAirport = airport;
//                }
//            }
//            System.out.println("The oldest airport---> " + oldestAirport);
//
//
//        }
//    }
//
//
//    }
//
//
//
//
//
//

