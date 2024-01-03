package _2_repeatingFunctionality;

import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Where to? ");
        int endNumber = Integer.parseInt(scan.nextLine());
        System.out.print("Where from? ");
        int startNumber = Integer.parseInt(scan.nextLine());

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}
