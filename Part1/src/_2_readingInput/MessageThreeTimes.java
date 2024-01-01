package _2_readingInput;

import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a message: ");
        String message = reader.nextLine();
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

        reader.close();
    }
}

