package _3_variables;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scan.nextLine());

        System.out.println("You gave the number " + number);

        scan.close();
    }
}
