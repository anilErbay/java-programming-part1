package _3_variables;

import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write something:");
        boolean boolValue = Boolean.parseBoolean(scan.nextLine());

        System.out.println("True or false? " + boolValue);

        scan.close();
    }
}
