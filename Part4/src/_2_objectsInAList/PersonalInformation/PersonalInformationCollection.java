package _2_objectsInAList.PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<PersonalInformation> personalInformations = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String firstName = scan.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = scan.nextLine();
            System.out.print("Identification number: ");
            String identificationNum = scan.nextLine();

            personalInformations.add(new PersonalInformation(firstName, lastName, identificationNum));
        }
        System.out.println(" ");
        for (PersonalInformation person : personalInformations) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        scan.close();
    }
}
