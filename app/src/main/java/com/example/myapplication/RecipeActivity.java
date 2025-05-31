package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {

    private TextView mRecipeName;
    private TextView mRecipeIngredients;
    private TextView mRecipeMethodTitle;
    private TextView mRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe); // Make sure this layout file exists

        mRecipeName = findViewById(R.id.text_recipe);
        mRecipeIngredients = findViewById(R.id.ingredients);
        mRecipeMethodTitle = findViewById(R.id.method);
        mRecipe = findViewById(R.id.recipe);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            String title = intent.getExtras().getString("RecipeName");
            String ingredients = intent.getExtras().getString("RecipeIngredients");
            String methodTitle = intent.getExtras().getString("RecipeMethodTitle");
            String recipe = intent.getExtras().getString("Recipe");

            mRecipeName.setText(title);
            mRecipeIngredients.setText(ingredients);
            mRecipeMethodTitle.setText(methodTitle);
            mRecipe.setText(recipe);
        }
    }
}

