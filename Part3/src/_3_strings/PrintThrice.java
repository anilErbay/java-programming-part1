package _3_strings;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a word: ");
        String word = scan.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print(word + "");
        }

        scan.close();
    }
}
