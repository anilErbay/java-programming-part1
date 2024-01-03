package _2_repeatingFunctionality;

import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}
