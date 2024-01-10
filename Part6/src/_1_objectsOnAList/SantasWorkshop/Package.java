package _1_objectsOnAList.SantasWorkshop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftsList;

    public Package() {
        this.giftsList = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        giftsList.add(gift);
    }

    public int totalWeight() {
        if (giftsList.isEmpty()) return -1;

        int sum = 0;
        for (Gift gift : giftsList) {
            sum += gift.getWeight();
        }
        return sum;
    }
}
