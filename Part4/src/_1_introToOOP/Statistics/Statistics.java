package _1_introToOOP.Statistics;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (sum == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }
}
