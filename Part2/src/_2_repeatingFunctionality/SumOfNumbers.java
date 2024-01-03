package _2_repeatingFunctionality;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scan.nextLine());

            if (number == 0) {
                break;
            }

            sum += number;
        }

        scan.close();
        System.out.println("Sum of the numbers: " + sum);
    }
}
