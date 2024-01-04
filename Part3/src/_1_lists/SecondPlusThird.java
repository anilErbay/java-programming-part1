package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scan.nextLine());
            if (number == 0) {
                break;
            }
            list.add(number);
        }
        scan.close();
        System.out.println(list.get(1) + list.get(2));
    }
}
