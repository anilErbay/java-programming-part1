package _3_filesAndReadingData.RecordsFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        scan.close();
    }
}
