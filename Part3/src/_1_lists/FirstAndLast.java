package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println(list.get(0)); // get.First()
        System.out.println(list.get(list.size() - 1)); // get.Last()

        scan.close();
    }
}
