package _1_OOP.Practice;

public class ClockHandMain {
    public static void main(String[] args) {
        Clock clock = new Clock();

        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }
}
