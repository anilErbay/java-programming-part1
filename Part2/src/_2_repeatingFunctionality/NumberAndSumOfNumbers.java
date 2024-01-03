package _2_repeatingFunctionality;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scan.nextLine());

            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        scan.close();
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
