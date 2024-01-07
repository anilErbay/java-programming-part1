package _2_objectsInAList.TelevisionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TelevisionProgram> tvPrograms = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.parseInt(scan.nextLine());
            tvPrograms.add(new TelevisionProgram(name, duration));
        }
        System.out.println(" ");
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scan.nextLine());

        for (TelevisionProgram program : tvPrograms) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
        scan.close();
    }
}
