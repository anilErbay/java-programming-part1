package _3_filesAndReadingData.PrintingAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(Paths.get("src/_3_filesAndReadingData/PrintingAFile/data.txt"))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
