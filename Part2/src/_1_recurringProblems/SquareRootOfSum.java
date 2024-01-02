package _1_recurringProblems;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println(Math.sqrt(num1 + num2));

        scan.close();
    }
}
