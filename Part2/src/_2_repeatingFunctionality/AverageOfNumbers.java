package _2_repeatingFunctionality;

import java.util.Scanner;

public class AverageOfNumbers {
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
            count++;
            sum += num;
        }
        scan.close();
        System.out.println("Average of the numbers: " + (1.0 * sum / count));
    }
}
