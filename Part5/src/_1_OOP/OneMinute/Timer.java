package _1_OOP.OneMinute;

public class Timer {
    private ClockHand seconds;
    private ClockHand hundrethsOfSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundrethsOfSeconds = new ClockHand(100);
    }

    public void advance() {
        this.hundrethsOfSeconds.advance();

        if (this.hundrethsOfSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundrethsOfSeconds;
    }
}
