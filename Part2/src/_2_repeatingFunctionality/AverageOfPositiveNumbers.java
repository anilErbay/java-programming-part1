package _2_repeatingFunctionality;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positives = 0;
        int sum = 0;

        while (true) {
            int num = Integer.parseInt(scan.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                sum += num;
                positives++;
            }
        }
        scan.close();
        if (positives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sum / positives);
        }
    }
}
