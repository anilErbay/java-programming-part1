package _2_repeatingFunctionality;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countNegatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scan.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                countNegatives++;
            }
        }

        scan.close();
        System.out.println("Number of negative numbers: " + countNegatives);
    }
}
