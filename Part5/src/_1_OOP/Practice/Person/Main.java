package _1_OOP.Practice.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = reader.nextLine();
        System.out.println("What's your age?");
        int age = Integer.parseInt(reader.nextLine());
        System.out.println("What's your weight?");
        double weight = Double.parseDouble(reader.nextLine());
        System.out.println("What's your height?");
        double height = Double.parseDouble(reader.nextLine());

        Person person = new Person(name, age, weight, height);
        System.out.println(person);

        reader.close();
    }
}
