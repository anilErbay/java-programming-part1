package _3_LargerProgrammingExercises.GradeStatistics;

import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    private ArrayList<Integer> points;
    private int sum;
    private int sumPassed;
    private int count;
    private int countPassed;

    public Grades() {
        this.points = new ArrayList<>();
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public int getSum() {
        return sum;
    }

    public int getSumPassed() {
        return sumPassed;
    }

    public int getCount() {
        return count;
    }

    public int getCountPassed() {
        return countPassed;
    }

    public void getThePoints() {
        Scanner scan = new Scanner(System.in);
        count = 0;
        countPassed = 0;
        sum = 0;
        sumPassed = 0;

        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int number = Integer.parseInt(scan.nextLine());
            if (number == -1) {
                break;
            } else if (number >= 0 && number <= 100) {
                sum += number;
                count++;
                points.add(number);
                if (number >= 50) {
                    sumPassed += number;
                    countPassed++;
                }
            }
        }
    }
}
