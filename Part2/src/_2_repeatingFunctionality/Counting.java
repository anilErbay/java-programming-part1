package _2_repeatingFunctionality;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}
