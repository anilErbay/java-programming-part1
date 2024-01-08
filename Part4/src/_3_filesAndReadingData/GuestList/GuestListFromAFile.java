package _3_filesAndReadingData.GuestList;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> guestList = new ArrayList<>();

        // ask which file
        System.out.println("Name of the file: ");
        String fileName = scan.nextLine();

        // read from the file
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                guestList.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }

        // check the names on the list
        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (guestList.contains(name)) {
                System.out.println("The name is on the list.");
            }
            if (!guestList.contains(name)) {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
        scan.close();
    }
}
