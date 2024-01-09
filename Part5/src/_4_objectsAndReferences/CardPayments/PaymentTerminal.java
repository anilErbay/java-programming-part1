package _4_objectsAndReferences.CardPayments;

public class PaymentTerminal {
    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.50;
    private static final double HEARTILY_PRICE = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
    }

    // cash payments
    public double eatAffordably(double payment) {
        if (payment >= AFFORDABLE_PRICE) {
            this.money += AFFORDABLE_PRICE;
            affordableMeals++;
            return payment - AFFORDABLE_PRICE;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= HEARTILY_PRICE) {
            this.money += HEARTILY_PRICE;
            heartyMeals++;
            return payment - HEARTILY_PRICE;
        }
        return payment;
    }

    // card payments
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= AFFORDABLE_PRICE) {
            card.takeMoney(AFFORDABLE_PRICE);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= HEARTILY_PRICE) {
            card.takeMoney(HEARTILY_PRICE);
            heartyMeals++;
            return true;
        }
        return false;
    }

    // add money to the card
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
