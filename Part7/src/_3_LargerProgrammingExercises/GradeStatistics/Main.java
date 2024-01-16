package _3_LargerProgrammingExercises.GradeStatistics;


public class Main {
    public static void main(String[] args) {
        Grades grades = new Grades();
        Statistics stats = new Statistics();

        grades.getThePoints();

        stats.averagePoints(grades.getCount(), grades.getSum());
        stats.averagePassingPoints(grades.getCountPassed(), grades.getSumPassed());
        stats.passedPercentage(grades.getCountPassed(), grades.getCount());
        stats.gradeDistribution(grades.getPoints());
    }
}
