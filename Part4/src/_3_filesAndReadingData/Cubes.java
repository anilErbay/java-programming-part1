package _3_filesAndReadingData;

import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            int num = Integer.parseInt(input);
            System.out.println(num * num * num);
        }
        scan.close();
    }
}

