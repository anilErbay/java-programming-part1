package _1_lists;

import java.util.ArrayList;

public class PracticeTopic {
    public static void main(String[] args) {

        // list as a method parameter
        ArrayList<String> fleet = new ArrayList<>();
        fleet.add("Boeing");
        fleet.add("Airbus");
        fleet.add("Bombardier");
        fleet.add("Cessna");

        print(fleet);

        // method with a list and other parameter
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        printSmallerThan(numbers, 5);
    }

    public static void print(ArrayList<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }

    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number : numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }
}
