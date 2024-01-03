package _3_methods;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(7);

    }

    private static void printFromNumberToOne(int num) {
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
