package _3_filesAndReadingData.NumbersFromAFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        // create scanner tool
        Scanner scan = new Scanner(System.in);

        // ask file name
        System.out.print("File? ");
        String fileName = scan.nextLine();

        // lower bound
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scan.nextLine());

        // upper bound
        System.out.print("Lower bound? ");
        int upperBound = Integer.parseInt(scan.nextLine());

        // create an array list to store the numbers from the list
        ArrayList<Integer> numbersList = new ArrayList<>();

        // read the file and add the numbers to the numbersList
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                int num = Integer.parseInt(fileReader.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    numbersList.add(num);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }

        // print out the size
        System.out.println("Numbers: " + numbersList.size());

        // close the scanner
        scan.close();
    }
}
