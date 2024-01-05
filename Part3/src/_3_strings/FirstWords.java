package _3_strings;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] splitted = input.split(" ");
            System.out.println(splitted[0]);
        }
        scan.close();
    }
}