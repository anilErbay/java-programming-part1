package _2_seperatingUserInterface.JokeManager;

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printMenu();
            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            } else if (option.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (option.equals("3")) {
                jokeManager.printJokes();
            } else if (option.equals("X")) {
                break;
            }
        }
        scanner.close();
    }

    public void printMenu() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }
}
