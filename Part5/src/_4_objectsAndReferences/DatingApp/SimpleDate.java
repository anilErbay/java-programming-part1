package _4_objectsAndReferences.DatingApp;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }
        return false;
    }

    // advance method
    public void advance() {
        if (this.month == 12 && this.day == 30) {
            this.year += 1;
            this.month += 1;
            this.day += 1;
        } else if (this.day == 30) {
            this.month += 1;
            this.day += 1;
        } else {
            this.day += 1;
        }
    }

    public void advance(int howManyDays) {
        int totalDays = this.day + howManyDays;
        int restOfDays = totalDays - this.day;
        if (totalDays >= 30) {
            if (this.month == 12) {
                this.year = this.year + 1;
                this.month = 1;
                this.day = restOfDays;
            } else {
                this.month = this.month + 1;
                this.day = restOfDays;
            }
        } else {
            this.day = this.day + totalDays;
        }
    }

    // after number of days method
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate;
        int year = this.year;
        int month = this.month;
        int day = this.day;
        int totalDays = day + days;
        int restOfDays = totalDays - day;
        if (totalDays >= 30) {
            if (this.month == 12) {
                year = year + 1;
                month = 1;
                day = restOfDays;
                newDate = new SimpleDate(day, month, year);
            } else {
                month = this.month + 1;
                day = restOfDays;
                newDate = new SimpleDate(day, month, year);
            }
        } else {
            day = day + totalDays;
            newDate = new SimpleDate(day, month, year);
        }
        return newDate;
    }
}
