package _1_objectsOnAList.CargoHold;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (holdWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public int holdWeight() {
        int holdWeight = 0;
        for (Suitcase suitcase : suitcases) {
            holdWeight += suitcase.totalWeight();
        }
        return holdWeight;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.holdWeight() + " kg)";
    }
}
