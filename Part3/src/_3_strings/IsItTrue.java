package _3_strings;

import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

        scan.close();
    }
}
