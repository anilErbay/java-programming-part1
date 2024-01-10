package _4_objectsAndReferences.Archive;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scan.nextLine();
            if (identifier.isEmpty()) break;

            System.out.println("Name? (empty will stop)");
            String name = scan.nextLine();
            if (name.isEmpty()) break;

            Item itemInput = new Item(identifier, name);

            if (!items.contains(itemInput)) items.add(itemInput);
        }

        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
