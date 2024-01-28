package session5.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        //nameOfArrayList<Type of data -need to be a class type that you save in the arrayList>

        ArrayList<Integer> arrayList = new ArrayList<>();
        //wrapper classes and autoboxing--> Integer int
        arrayList.add(23);//autoboxing happens implicitly

        arrayList.add(2,50);
        Integer x = arrayList.get(2);

        for (Integer element: arrayList){
            System.out.println(element);
        }
    }
}
