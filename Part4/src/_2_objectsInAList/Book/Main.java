package _2_objectsInAList.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> booksList = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.parseInt(scan.nextLine());

            booksList.add(new Book(title, pages, year));
        }
        System.out.println(" ");

        System.out.print("What information will be printed? ");
        String infoToPrint = scan.nextLine();

        if (infoToPrint.equals("everything")) {
            for (Book book : booksList) {
                System.out.println(book);
            }
        }

        if (infoToPrint.equals("name")) {
            for (Book book : booksList) {
                System.out.println(book.getTitle());
            }
        }
        scan.close();
    }
}
