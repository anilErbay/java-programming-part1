package _1_OOP.Practice;

public class ClockWithoutOOP {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        // !!! Loop runs forever !!!
        while (true) {
            // printing the time
            if (hours < 10) {
                System.out.print("0");
            }
            System.out.print(hours);
            System.out.print(":");

            if (minutes < 10) {
                System.out.print("0");
                System.out.print(minutes);
                System.out.print(":");
            }

            if (seconds < 10) {
                System.out.print("0");
            }
            System.out.print(seconds);
            System.out.println();

            // the second hand's progress
            seconds += 1;

            // other hand's progress when necessary
            if (seconds > 59) {
                minutes += 1;
                seconds = 0;

                if (minutes > 59) {
                    hours += 1;
                    minutes = 0;

                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }
    }
}
