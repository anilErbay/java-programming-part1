package _2_objectsInAList.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // read person information from the user
        while (true) {
            System.out.print("Enter name, empty will end: ");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Enter the age of the person " + name + ": ");
            int age = Integer.parseInt(scan.nextLine());

            // We add a new person to the list.
            // The person's name and age were decided by the user
            persons.add(new Person(name, age));
        }

        // We'll print the number of the inputted persons, and the persons themselves
        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");

        for (Person person : persons) {
            System.out.println(person);
        }
        scan.close();
    }
}
