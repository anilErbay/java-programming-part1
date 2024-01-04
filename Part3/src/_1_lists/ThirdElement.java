package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<>();
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            myList.add(input);
        }
        System.out.println(myList.get(2));
        scan.close();
    }
}
