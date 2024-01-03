package _2_repeatingFunctionality;

import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNum = Integer.parseInt(scan.nextLine());
        System.out.print("Last number? ");
        int lastNum = Integer.parseInt(scan.nextLine());

        int sum = 0;
        for (int i = firstNum; i <= lastNum; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
        scan.close();
    }
}
