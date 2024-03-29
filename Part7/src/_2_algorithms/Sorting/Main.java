package _2_algorithms.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    // smallest number
    public static int smallest(int[] array) {

        int minValue = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    public static int smallest(int[] array, int startIndex) {

        int minValue = Integer.MAX_VALUE;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // index of smallest value
    public static int indexOfSmallest(int[] array) {

        int index = 0;
        int min = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                index = i;
            }
        }
        return index;
    }

    // index of smallest from
    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int index = 0;
        int min = smallest(table, startIndex);
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == min) {
                index = i;
            }
        }
        return index;
    }

    // swap
    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // sort
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
