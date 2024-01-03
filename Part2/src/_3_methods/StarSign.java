package _3_methods;

public class StarSign {
    public static void main(String[] args) {
        //printStars(7);
        //printSquare(4);
        //printRectangle(17, 3);
        printTriangle(7);
    }

    //print stars method
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    // print square method
    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(size);
        }
    }

    // print rectangle method
    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    // print triangle method
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
