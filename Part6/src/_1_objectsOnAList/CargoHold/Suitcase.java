package _1_objectsOnAList.CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    // add item method
    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= maxWeight) {
            items.add(item);
        }
    }

    // total weight method
    public int totalWeight() {
        int total = 0;
        for (Item element : items) {
            total += element.getWeight();
        }
        return total;
    }

    // print items method
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    // find the heaviest item
    public Item heaviestItem() {
        if (items.isEmpty()) return null;

        Item heaviestItem = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items (0kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
