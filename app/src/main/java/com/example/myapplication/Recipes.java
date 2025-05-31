
package com.example.myapplication;

public class Recipes {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;
    private String category;

    public Recipes() {
        // Required empty constructor
    }

    // ✅ Constructor without category
    public Recipes(String name, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail) {
        RecipeName = name;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
    }

    // ✅ Constructor with category
    public Recipes(String name, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail, String category) {
        RecipeName = name;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
        this.category = category;
    }

    // ✅ Getters
    public String getRecipeName() {
        return RecipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getCategory() {
        return category;
    }
}
