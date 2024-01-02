package _1_recurringProblems;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }

        scan.close();
    }
}
