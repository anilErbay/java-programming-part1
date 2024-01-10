package _4_objectsAndReferences.Money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    // plus
    public Money plus(Money addition) {
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();

        if (cents > 99) {
            cents -= 100;
            euros += 1;
        }
        return new Money(euros, cents);
    }

    // minus
    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();

        if (cents < 0) {
            cents += 100;
            euros -= 1;
        }

        // if the value becomes negative, return zero
        if (euros < 0) {
            return new Money(0, 0);
        }
        return new Money(euros, cents);
    }


    // less than
    public boolean lessThan(Money compared) {
        return (100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents());
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
}
