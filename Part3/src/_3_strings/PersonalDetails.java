package _3_strings;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String longestName = "";

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            // sum of the birth years, and count
            sum += Integer.parseInt(parts[1]);
            count++;

            // check and assign the longest name
            if (parts[0].length() > longestName.length()) {
                longestName = parts[0];
            }

        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
        scan.close();
    }
}
