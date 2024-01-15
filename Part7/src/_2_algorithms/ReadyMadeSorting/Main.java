package _2_algorithms.ReadyMadeSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] numbersArray = {3, 1, 5, 99, 3, 12};
        String[] strArray = {"K", "A", "Z", "L", "C", "M"};

        System.out.println(Arrays.toString(numbersArray));
        System.out.println(Arrays.toString(strArray));
        System.out.println("========================");

        sort(numbersArray);
        System.out.println(Arrays.toString(numbersArray));

        sort(strArray);
        System.out.println(Arrays.toString(strArray));
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}