package _3_methods;

public class FromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(7);
    }

    private static void printUntilNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
