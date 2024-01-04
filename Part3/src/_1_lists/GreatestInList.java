package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = Integer.parseInt(scan.nextLine());
            if (num == -1) {
                break;
            }
            list.add(num);
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("The greatest number: " + max);
        scan.close();
    }
}
