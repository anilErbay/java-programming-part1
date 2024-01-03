package _3_methods;

public class AdvancedAstrology {
    public static void main(String[] args) {
        christmasTree(10);
    }

    //print stars method
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    // print spaces method
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    // print right-leaning triangle
    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            System.out.println(" ".repeat(size - i) + "*".repeat(i));
        }
    }

    // print christmas tree
    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;

        while (i <= height) {
            printSpaces(j);
            printStars(i * 2 - 1);
            i++;
            j--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }
}
