package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
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
        System.out.print("From where? ");
        int beginIndex = Integer.parseInt(scan.nextLine());
        System.out.print("To where? ");
        int endIndex = Integer.parseInt(scan.nextLine());

        for (int i = beginIndex; i <= endIndex; i++) {
            System.out.println(list.get(i));
        }
        scan.close();
    }
}
