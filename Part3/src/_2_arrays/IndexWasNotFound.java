package _2_arrays;

import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searchedNumber = Integer.parseInt(scan.nextLine());

        boolean found = false;
        int index = 0;
        while (index < array.length) {
            if (searchedNumber == array[index]) {
                System.out.println(searchedNumber + " is at index " + index + ".");
                found = true;
            }
            index++;
        }
        if (!found) {
            System.out.println(searchedNumber + " was not found.");
        }

        scan.close();
    }
}
