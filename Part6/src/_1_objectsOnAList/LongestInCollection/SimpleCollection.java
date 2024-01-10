package _1_objectsOnAList.LongestInCollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    // longest
    public String longest() {
        if (elements.isEmpty()) return null;

        String longestOne = elements.get(0);
        for (String element : elements) {
            if (element.length() > longestOne.length()) {
                longestOne = element;
            }
        }
        return longestOne;
    }
}
