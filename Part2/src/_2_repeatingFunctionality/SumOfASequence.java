package _2_repeatingFunctionality;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number? ");
        int lastNumber = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        scan.close();
        System.out.println("The sum is " + sum);
    }
}
