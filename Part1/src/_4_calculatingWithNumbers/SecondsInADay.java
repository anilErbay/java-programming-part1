package _4_calculatingWithNumbers;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int numOfDays = Integer.parseInt(scan.nextLine());
        int seconds = numOfDays * 24 * 60 * 60;
        System.out.println(seconds);

        scan.close();
    }
}

