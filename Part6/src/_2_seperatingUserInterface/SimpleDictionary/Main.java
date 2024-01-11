package _2_seperatingUserInterface.SimpleDictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scan, dictionary);
        textUI.start();
        scan.close();
    }
}
