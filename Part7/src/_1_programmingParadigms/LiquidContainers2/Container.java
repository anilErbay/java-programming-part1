package _1_programmingParadigms.LiquidContainers2;

public class Container {
    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void add(int amount) {
        if (liquidAmount + amount <= 100 && amount >= 0) {
            liquidAmount += amount;
        } else {
            liquidAmount = 100;
        }
    }

    public void remove(int amount) {
        if (liquidAmount - amount >= 0 && liquidAmount - amount <= 100) {
            liquidAmount -= amount;
        } else {
            liquidAmount = 0;
        }
    }

    public String toString() {
        return liquidAmount + "/100";
    }

    public void setLiquidAmount(int liquidAmount) {
        this.liquidAmount = liquidAmount;
    }
}


