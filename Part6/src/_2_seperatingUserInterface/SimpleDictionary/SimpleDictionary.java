package _2_seperatingUserInterface.SimpleDictionary;

import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }
}
