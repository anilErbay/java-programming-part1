package _3_strings;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(",");
            int age = Integer.parseInt(pieces[1]);

            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);

        scan.close();
    }
}
