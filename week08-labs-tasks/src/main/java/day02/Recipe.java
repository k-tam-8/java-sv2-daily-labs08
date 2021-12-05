package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    List<String> ingredients = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void addIngredients(String s, String... ingredient) {
        ingredients.add(s);
        ingredients.addAll(Arrays.asList(ingredient));
    }
}
