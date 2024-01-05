package _3_strings;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] splittedInput = input.split(" ");
            for (int i = 0; i < splittedInput.length; i++) {
                System.out.println(splittedInput[i]);
            }
        }
        scan.close();
    }
}
