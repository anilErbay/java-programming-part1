package _2_repeatingFunctionality;

import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scan.nextLine());

            if (number == 0) {
                break;
            }
            count++;
        }

        scan.close();
        System.out.println("Number of numbers: " + count);
    }
}
