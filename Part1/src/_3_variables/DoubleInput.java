package _3_variables;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        double number = Double.parseDouble(scan.nextLine());

        System.out.println("You gave the number " + number);

        scan.close();
    }
}
