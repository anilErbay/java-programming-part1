package _2_seperatingUserInterface.Practice;

import java.util.Scanner;

public class UserInterface {
    private WordSet wordSet;
    private Scanner scan;

    public UserInterface(WordSet wordSet, Scanner scan) {
        this.wordSet = wordSet;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String word = scan.nextLine();

            if (word.equals("")) {
                break;
            }
            if (wordSet.contains(word)) {
                System.out.println("You have entered the same word twice!");
                continue;
            }
            wordSet.add(word);
        }
        scan.close();
    }
}
