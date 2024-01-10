package _4_objectsAndReferences.Bird;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Bird red = new Bird("Red");
        System.out.println(red);

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck);

        if (red.equals(chuck)) {
            System.out.println(red + " equals " + chuck);
        } else {
            System.out.println(red + " is not equal to " + chuck);
        }
        */
        ArrayList<Bird> birds = new ArrayList<>();
        Bird red = new Bird("Red");

        if (birds.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }

        birds.add(red);
        if (birds.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }


        System.out.println("However!");

        red = new Bird("Red");
        if (birds.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }
    }
}
