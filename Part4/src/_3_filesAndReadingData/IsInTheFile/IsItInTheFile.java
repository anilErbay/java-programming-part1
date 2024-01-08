package _3_filesAndReadingData.IsInTheFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask user which file
        System.out.println("Name of the file:");
        String fileName = scan.nextLine();

        // ask user which string
        System.out.println("Search for:");
        String searchedItem = scan.nextLine();

        // Create an arrayList to collect the data from the file
        ArrayList<String> list = new ArrayList<>();

        // read the file and add it to the list
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        // check if the item exists or not and print found/not found
        if (list.contains(searchedItem)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

        scan.close();
    }
}
