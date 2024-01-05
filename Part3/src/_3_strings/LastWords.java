package _3_strings;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] splitted = input.split(" ");
            System.out.println(splitted[splitted.length - 1]);
        }
        scan.close();
    }
}
