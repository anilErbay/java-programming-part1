package _2_algorithms.Practice;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 7, 11, 23, 0, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(linearSearch(numbers, 7));
    }

    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }
        return -1;
    }
}
