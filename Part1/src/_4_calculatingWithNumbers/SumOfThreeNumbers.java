package _4_calculatingWithNumbers;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.parseInt(scan.nextLine());
        System.out.println("Give the third number:");
        int thirdNum = Integer.parseInt(scan.nextLine());

        System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum));

        scan.close();
    }
}
