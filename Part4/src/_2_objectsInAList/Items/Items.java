package _2_objectsInAList.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String inputItem = scan.nextLine();
            if (inputItem.isEmpty()) {
                break;
            }
            items.add(new Item(inputItem));
        }
        for (Item item : items) {
            System.out.println(item);
        }

        scan.close();
    }
}
