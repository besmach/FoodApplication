package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Category> categories;
    CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.recyclerView_categories);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        categories = new ArrayList<>();
        categories.add(new Category("Breakfast", R.drawable.breakfast));
        categories.add(new Category("Indian", R.drawable.indian));
        categories.add(new Category("Dessert", R.drawable.desserts));
        categories.add(new Category("Traditional", R.drawable.traditional));
        categories.add(new Category("Breads", R.drawable.breads));
        categories.add(new Category("Soups & Stews", R.drawable.soups));

        adapter = new CategoryAdapter(this, categories);
        recyclerView.setAdapter(adapter);
    }
}
