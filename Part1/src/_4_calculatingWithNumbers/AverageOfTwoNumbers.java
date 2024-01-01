package _4_calculatingWithNumbers;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println("The average is " + (1.0 * num1 + num2) / 2);

        scan.close();
    }
}
