package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        System.out.print("Search for? ");
        String searchedItem = scan.nextLine();
        if (list.contains(searchedItem)) {
            System.out.println(searchedItem + " was found!");
        } else {
            System.out.println(searchedItem + " was not found!");
        }

        scan.close();
    }
}
