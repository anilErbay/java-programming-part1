package _1_introToOOP.Statistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        /*
        statistics.addNumber(3);
        statistics.addNumber(5);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
         */

        System.out.println();
        // user input part of the program
        Scanner scan = new Scanner(System.in);

        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int inputNum = scan.nextInt();
            if (inputNum == -1) {
                break;
            }
            statistics.addNumber(inputNum);

            if (inputNum % 2 == 0) {
                evenNumbers.addNumber(inputNum);
            } else {
                oddNumbers.addNumber(inputNum);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());

        scan.close();
    }
}
