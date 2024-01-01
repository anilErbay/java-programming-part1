package _4_calculatingWithNumbers;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (1.0 * num1 / num2));

        scan.close();
    }
}
