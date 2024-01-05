package _3_strings;

import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int oldestAge = 0;
        String name = "";
        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(",");

            int age = Integer.parseInt(pieces[1]);
            for (int i = 0; i < pieces.length; i++) {
                if (age > oldestAge) {
                    oldestAge = age;
                    name = pieces[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + name);
        scan.close();
    }
}
