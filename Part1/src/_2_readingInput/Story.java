package _2_readingInput;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String nameOfCharacter = scanner.nextLine();

        System.out.println("What is their job?");
        String jobOfCharacter = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + nameOfCharacter + ", who was " + jobOfCharacter + ".");
        System.out.println("On the way to work, " + nameOfCharacter + " reflected on life.");
        System.out.println("Perhaps " + nameOfCharacter + " will not be " + jobOfCharacter + " forever.");

        scanner.close();
    }
}
