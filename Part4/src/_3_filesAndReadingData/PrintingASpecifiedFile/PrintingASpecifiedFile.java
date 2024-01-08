package _3_filesAndReadingData.PrintingASpecifiedFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = scan.nextLine();
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        scan.close();
    }
}
