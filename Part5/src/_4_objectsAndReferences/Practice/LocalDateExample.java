package _4_objectsAndReferences.Practice;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        System.out.println("today is  " + day + "." + month + "." + year);
    }
}
