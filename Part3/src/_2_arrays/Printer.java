package _2_arrays;

public class Printer {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        printArrayInStars(numbers);
    }

    public static void printArrayInStars(int[] array) {
        for (int value : array) {
            for (int i = 1; i <= value; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
