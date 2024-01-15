package _2_algorithms.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BuiltInSorting {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        // *******
        System.out.println("=================");

        LinkedList<Integer> numbersList = new LinkedList<>();
        numbersList.add(8);
        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(1);

        System.out.println(numbersList);
        Collections.sort(numbersList);
        System.out.println(numbersList);

    }
}
