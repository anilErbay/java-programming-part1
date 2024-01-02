package _1_recurringProblems;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        System.out.println(num * num);

        scan.close();
    }
}
