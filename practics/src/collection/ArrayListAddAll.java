package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAll {

    public static void main(String[] args) {
        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(5);
        Numbers.add(7);
        Numbers.add(11);

        // Creating an ArrayList from another collection
        List<Integer> Number2 = new ArrayList<>(Numbers);


        List<Integer> Number3 = new ArrayList<>();
        Number3.add(13);
        Number3.add(17);
        Number3.add(19);
        Number3.add(23);
        Number3.add(29);

        // Adding an entire collection to an ArrayList
    Number2.addAll(Numbers);

        System.out.println(Number2);
    }
}