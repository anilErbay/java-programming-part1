package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

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
        scan.close();
        //System.out.println(list.getLast());
        System.out.println(list.get(list.size() - 1));
    }
}
