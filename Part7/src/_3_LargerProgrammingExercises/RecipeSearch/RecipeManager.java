package _3_LargerProgrammingExercises.RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    private ArrayList<String> ingredients;
    private ArrayList<Recipe> recipesList;

    public RecipeManager() {
        this.ingredients = new ArrayList<>();
        this.recipesList = new ArrayList<>();
    }

    public void readRecipe(String fileName) {
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String recipeName = input.nextLine();
                int cookingTime = Integer.parseInt(input.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipesList.add(recipe);
                while (input.hasNextLine()) {
                    String ingredient = input.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: ");
        }
    }

    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipesList) {
            System.out.println(recipe);
        }
    }

    public void findName(String nameToSearch) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipesList) {
            if (recipe.getRecipeName().contains(nameToSearch)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime(int maxCookingTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipesList) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String ingredient) {
        for (int i = 0; i < recipesList.size(); i++) {
            if (recipesList.get(i).getIngredients().contains(ingredient)) {
                System.out.println(recipesList.get(i));
            }
        }
    }
}
