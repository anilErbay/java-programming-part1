package _2_repeatingFunctionality;

import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scan.nextLine());

            if (number == 4) {
                break;
            }
        }

        scan.close();
    }
}
