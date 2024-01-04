package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbersList = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scan.nextLine());
            if (number == -1) {
                break;
            }
            numbersList.add(number);
        }
        System.out.println(" ");
        System.out.print("Search for? ");
        int searchedNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == searchedNumber) {
                System.out.println(searchedNumber + " is at index " + i);
            }
        }

        scan.close();
    }
}
