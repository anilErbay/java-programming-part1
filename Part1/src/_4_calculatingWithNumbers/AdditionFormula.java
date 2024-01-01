package _4_calculatingWithNumbers;

import java.util.Scanner;

public class AdditionFormula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scan.nextLine());

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

        scan.close();
    }
}
