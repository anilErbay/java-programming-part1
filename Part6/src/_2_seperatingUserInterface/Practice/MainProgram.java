package _2_seperatingUserInterface.Practice;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WordSet set = new WordSet();
        UserInterface userInterface = new UserInterface(set, scan);

        userInterface.start();
        set.printInfo();

        scan.close();
    }
}
