package _3_methods;

public class Smallest {
    public static void main(String[] args) {
        int answer = smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }

    public static int smallest(int number1, int number2) {
        return Math.min(number1, number2);
    }
}
