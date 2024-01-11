package _2_seperatingUserInterface.JokeManager;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        System.out.println("Drawing a joke.");
        if (jokes.size() > 0) {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        } else {
            return "Jokes are in short supply.";
        }
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
