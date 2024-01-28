package session5.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease type out some numbers and end with 0");

        ArrayList<String> numbers = new ArrayList<String>();
        int value;

        do {
            value= scanner.nextInt();
            if(!list.contains(value) && value !=0){
            list.add(value);
            }
        }while (value !=0);

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+ " ");
        }

    }
}
