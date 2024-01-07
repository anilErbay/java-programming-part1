package _2_objectsInAList.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        // Read person information from the user
        System.out.println("Enter the person details separated by a comma, e.g.: Randall,2");

        while (true) {
            System.out.print("Enter the details, empty will stop: ");
            String details = scan.nextLine();
            if (details.isEmpty()) {
                break;
            }
            String[] parts = details.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            persons.add(new Person(name, age));
        }

        // Print the number of the entered persons, and the persons themselves
        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");

        for (Person person : persons) {
            System.out.println(person);
        }
        scan.close();
    }
}
