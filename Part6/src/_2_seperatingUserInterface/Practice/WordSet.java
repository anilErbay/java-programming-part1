package _2_seperatingUserInterface.Practice;

import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        words.add(word);
    }

    public boolean contains(String word) {
        return words.contains(word);
    }

    public int palindromes() {
        int count = 0;

        for (String word : words) {
            if (isPalindrome(word))
                count++;
        }
        return count;
    }

    public boolean isPalindrome(String word) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // compare original with its reverse
        String reversedWord = new StringBuilder(cleanWord).reverse().toString();
        return cleanWord.equals(reversedWord);
    }

    public void printInfo() {
        System.out.println("====== INFO ======\n");
        System.out.println("Entered words:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
        System.out.println("You have entered following palindromes (" + palindromes() + ")");
        for (String word : words) {
            if (isPalindrome(word))
                System.out.println(word);
        }
    }
}
