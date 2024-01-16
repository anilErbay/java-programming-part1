package _3_LargerProgrammingExercises.BigYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase birds = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String userCommand = scan.nextLine();

            switch (userCommand) {
                case "Add":
                    birds.addBird(scan);
                    break;
                case "Observation":
                    birds.observeBird(scan);
                    break;
                case "All":
                    birds.retrieveAllBirds();
                    break;
                case "One":
                    birds.retrieveOneBird(scan);
                    break;
                case "Quit":
                    return;
                default:
                    System.out.println("Sorry. Unsupported option.");
                    break;
            }
        }
    }
}
