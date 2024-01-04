package _1_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
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

        int sum = 0;
        int count = 0;
        for (int num : numbersList) {
            sum += num;
            count++;
        }
        System.out.println("Average: " + (1.0 * sum / count));

        scan.close();
    }
}
