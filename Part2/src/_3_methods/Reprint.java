package _3_methods;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many times?");
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++) {
            printText();
        }
        scan.close();
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
