package _5_conditionalStatements;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int cost = Integer.parseInt(scan.nextLine());

        if (cost < 5000) {
            System.out.println("No tax!");
        } else if ((cost >= 5000) && (cost < 25000)) {
            System.out.println("Tax: " + (100 + (cost - 5000) * 0.08));
        } else if ((cost >= 25000) && (cost < 55000)) {
            System.out.println("Tax: " + (1700 + (cost - 25000) * 0.1));
        } else if ((cost >= 55000 && (cost < 200000))) {
            System.out.println("Tax: " + (4700 + (cost - 55000) * 0.12));
        } else if ((cost >= 200000 && (cost < 1000000))) {
            System.out.println("Tax: " + ((22100 + (cost - 200000) * 0.15)));
        } else if (cost >= 1000000) {
            System.out.println("Tax: " + (142100 + (cost - 1000000) * 0.17));
        }

        scan.close();
    }
}
