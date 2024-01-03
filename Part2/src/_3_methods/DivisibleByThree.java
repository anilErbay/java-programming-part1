package _3_methods;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 15);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
