package _3_variables;

import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String myString = scan.nextLine();

        System.out.println("Give an integer:");
        int myInteger = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double myDouble = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean myBool = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + myString);
        System.out.println("You gave the integer " + myInteger);
        System.out.println("You gave the double " + myDouble);
        System.out.println("You gave the boolean " + myBool);

        scan.close();
    }
}

