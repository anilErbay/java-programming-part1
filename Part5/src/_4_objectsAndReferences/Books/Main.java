package _4_objectsAndReferences.Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Publication year:");
            int year = Integer.parseInt(scan.nextLine());

            Book book = new Book(name, year);

            if (!books.contains(book)) {
                books.add(book);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }
        }

        System.out.println("Thank you! Books added: " + books.size());

        scan.close();
    }
}
