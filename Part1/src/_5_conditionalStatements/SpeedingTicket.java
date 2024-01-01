package _5_conditionalStatements;

import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Give speed:");
        int speed = Integer.parseInt(scan.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }

        scan.close();
    }
}
