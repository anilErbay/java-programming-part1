package _2_seperatingUserInterface.SimpleDictionary;

import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userInput = scan.nextLine();

            if (userInput.equals("end")) {
                end();
                break;
            } else if (userInput.equals("add")) {
                add();
            } else if (userInput.equals("search")) {
                search();
            } else {
                System.out.println("Unknown command");
            }
        }
        scan.close();
    }

    public void end() {
        System.out.println("Bye bye!");
    }

    public void add() {
        System.out.print("Word: ");
        String word = scan.nextLine();
        System.out.print("Translation: ");
        String translation = scan.nextLine();
        dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String searchedWord = scan.nextLine();

        if (dictionary.translate(searchedWord) != null) {
            System.out.print("Translation: ");
            System.out.println(dictionary.translate(searchedWord));
        } else {
            System.out.println("Word " + searchedWord + " was not found");
        }
    }
}
