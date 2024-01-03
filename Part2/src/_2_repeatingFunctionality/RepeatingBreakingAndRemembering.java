package _2_repeatingFunctionality;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        int evens = 0;
        int odds = 0;
        while (true) {
            int number = Integer.parseInt(scan.nextLine());

            if (number == -1) {
                break;
            }
            sum += number;
            count++;

            if (number % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        double avg = 1.0 * sum / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);

        scan.close();
    }
}
