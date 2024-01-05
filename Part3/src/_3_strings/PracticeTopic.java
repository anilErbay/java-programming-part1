package _3_strings;

import java.util.Scanner;

public class PracticeTopic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            sum += Integer.parseInt(pieces[1]);
            count++;
        }
        if (count > 0) {
            System.out.println("Age average: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }

        scan.close();
    }
}
