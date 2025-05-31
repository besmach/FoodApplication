package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();

        // Get the selected category
        String category = getIntent().getStringExtra("category");

        // Show recipes based on selected category
        if (category == null || category.equals("Breakfast")) {
            // Breakfast recipes
            recipes1.add(new Recipes("Pancake", "1 1/4 cups milk\n1 egg\n3 tablespoons butter melted\n1 1/2 cups all-purpose flour\n3 1/2 teaspoons baking powder\n1 teaspoon salt\n1 tablespoon white sugar", "Method", "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth. Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.", R.drawable.pancakes));

            recipes1.add(new Recipes("Donut", "1 c. whole milk\n1/4 c. plus 1 tsp. granulated sugar, divided\n1 packet (or 2 1/4 tsp.) active dry yeast\n4 c. all-purpose flour, plus more if needed\n1/2 tsp. kosher salt\n6 tbsp. melted butter\n2 large eggs\n1/2 tsp. pure vanilla extract\nCanola or vegetable oil, for frying", "Method", "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\nMake glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\nLine a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\nTransfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)", R.drawable.donut1));

        } else if (category.equals("Indian")) {
            // Indian recipes
            recipes1.add(new Recipes("Dosa", "3 cups rice\n1 cup urad daal (split, skinless black gram)\n3/4 teaspoon fenugreek seeds\nSalt (to taste)\nVegetable / canola / sunflower cooking oil", "Method", "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\nPut some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\nWhen the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\nThe dosa is almost done. Fold it in half and allow to cook for 30 seconds more.", R.drawable.dosa1));

            recipes1.add(new Recipes("Chicken Roll", "200 gm chopped into cubes chicken\n1 medium chopped tomato\n1/2 pinch red chilli powder\n2 tablespoon vegetable oil\n1/2 cut into strips cucumber\n1/2 tablespoon chopped coriander leaves\n1 large thinly sliced onion\n2 medium chopped green chilli\n2 pinches garam masala powder\n1 lemon wedges\n1 teaspoon tomato ketchup\n1 tablespoon green chilli sauce", "Method", "Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!", R.drawable.chicken_roll));

        } else if (category.equals("Soups & Stews")) {
            // Soups & Stews recipes
            recipes1.add(new Recipes("Chorba frik", "1/2 cup frik (cracked wheat)\n1/2 lb lamb or chicken\n1 onion, chopped\n2 tomatoes, grated\n1 tbsp tomato paste\n1/4 cup chickpeas (soaked overnight)\n1 tsp paprika\n1 tsp cumin\nSalt & pepper\nChopped parsley & coriander", "Method", "In a large pot, sauté onion and meat in oil until browned. Add tomatoes, paste, and spices. Cook a few minutes, then add chickpeas and 1.5 L water. Bring to a boil. Add frik and simmer until chickpeas are tender. Finish with parsley and coriander.", R.drawable.chorba));

            recipes1.add(new Recipes("Hrira", "1/2 cup lentils\n1/4 cup rice\n1 onion, chopped\n2 tomatoes, chopped\n1/4 cup chickpeas\n1 tsp cinnamon\n1 tsp ginger\nSalt & pepper\nFresh herbs", "Method", "Traditional Moroccan soup perfect for breaking fast. Soak lentils and chickpeas overnight. Sauté onions, add tomatoes and spices. Add lentils, chickpeas and water. Simmer until tender. Add rice and cook until soft. Season and garnish with herbs.", R.drawable.hrira));

            recipes1.add(new Recipes("Chirba Beida", "6 eggs\n1 onion, chopped\n2 tomatoes, chopped\n1 tsp turmeric\n1 tsp paprika\nSalt & pepper\nFresh parsley\nOlive oil", "Method", "Heat oil in pan, sauté onions until soft. Add tomatoes and spices, cook until thick. Beat eggs and pour into pan. Scramble gently until eggs are cooked. Season with salt, pepper and fresh parsley.", R.drawable.beida));

        } else if (category.equals("Traditional")) {  // Fixed case sensitivity
            // Traditional recipes
            recipes1.add(new Recipes("Couscous", "2 cups couscous\n1 lb lamb or chicken\n2 carrots, chopped\n2 zucchini, chopped\n1 onion, chopped\n1/4 cup chickpeas\n1 tsp ras el hanout\nSalt & pepper\nBroth", "Method", "Steam couscous according to package instructions. In a large pot, brown meat with onions. Add vegetables, chickpeas, spices and broth. Simmer until vegetables are tender. Serve couscous topped with stew.", R.drawable.couscous));

            recipes1.add(new Recipes("Tajin", "1 lb chicken or lamb\n1 onion, sliced\n2 preserved lemons\n1 cup olives\n1 tsp ginger\n1 tsp saffron\nSalt & pepper\nOlive oil", "Method", "In a tajine or heavy pot, brown meat with onions and spices. Add preserved lemons and olives. Cover and cook slowly until meat is tender. Serve hot with bread.", R.drawable.tajin));

            recipes1.add(new Recipes("Rechta", "2 cups flour\n3 eggs\n1 tsp salt\n1 lb chicken\n1 onion, chopped\n2 tsp ras el hanout\nChickpeas\nBroth", "Method", "Make pasta dough with flour, eggs and salt. Roll thin and cut into strips. Cook chicken with onions and spices. Add chickpeas and broth. Add pasta and cook until tender.", R.drawable.rechta));
            recipes1.add(new Recipes("Mhadjeb", "2 cups couscous\n1 lb lamb or chicken\n2 carrots, chopped\n2 zucchini, chopped\n1 onion, chopped\n1/4 cup chickpeas\n1 tsp ras el hanout\nSalt & pepper\nBroth", "Method", "Steam couscous according to package instructions. In a large pot, brown meat with onions. Add vegetables, chickpeas, spices and broth. Simmer until vegetables are tender. Serve couscous topped with stew.", R.drawable.couscous));

            recipes1.add(new Recipes("Dolma", "1 lb chicken or lamb\n1 onion, sliced\n2 preserved lemons\n1 cup olives\n1 tsp ginger\n1 tsp saffron\nSalt & pepper\nOlive oil", "Method", "In a tajine or heavy pot, brown meat with onions and spices. Add preserved lemons and olives. Cover and cook slowly until meat is tender. Serve hot with bread.", R.drawable.tajin));

            recipes1.add(new Recipes("Lham lhlou", "2 cups flour\n3 eggs\n1 tsp salt\n1 lb chicken\n1 onion, chopped\n2 tsp ras el hanout\nChickpeas\nBroth", "Method", "Make pasta dough with flour, eggs and salt. Roll thin and cut into strips. Cook chicken with onions and spices. Add chickpeas and broth. Add pasta and cook until tender.", R.drawable.rechta));

        } else if (category.equals("Breads")) {  // Fixed case sensitivity
            // Breads recipes
            recipes1.add(new Recipes("Kesra", "3 cups semolina flour\n1 cup warm water\n1 tsp salt\n1 tsp sugar\n2 tsp active dry yeast\n2 tbsp olive oil", "Method", "Mix yeast with warm water and sugar. Let foam for 5 minutes. Mix flour and salt in a bowl. Add yeast mixture and oil. Knead until smooth. Let rise for 1 hour. Shape into rounds and bake at 400°F for 20-25 minutes.", R.drawable.kesra));

            recipes1.add(new Recipes("Khobbz el dar", "4 cups flour\n1 1/2 cups warm water\n2 tsp yeast\n1 tsp salt\n1 tsp sugar\n2 tbsp oil", "Method", "Mix yeast with warm water and sugar. Combine flour and salt. Add yeast mixture and oil. Knead well. Let rise for 1 hour. Shape and bake at 425°F for 25-30 minutes until golden.", R.drawable.khobz));

            recipes1.add(new Recipes("Matlou3", "2 cups flour\n1 cup warm water\n1 tsp yeast\n1 tsp salt\n1 tbsp olive oil\nSesame seeds", "Method", "Mix yeast with warm water. Combine flour and salt. Add yeast mixture and oil. Knead until smooth. Let rise for 45 minutes. Shape into flat rounds, sprinkle with sesame seeds. Bake at 450°F for 15-20 minutes.", R.drawable.matlou3));
            recipes1.add(new Recipes("Kesra", "3 cups semolina flour\n1 cup warm water\n1 tsp salt\n1 tsp sugar\n2 tsp active dry yeast\n2 tbsp olive oil", "Method", "Mix yeast with warm water and sugar. Let foam for 5 minutes. Mix flour and salt in a bowl. Add yeast mixture and oil. Knead until smooth. Let rise for 1 hour. Shape into rounds and bake at 400°F for 20-25 minutes.", R.drawable.kesra));
            recipes1.add(new Recipes("Bariouch", "4 cups flour\n1 1/2 cups warm water\n2 tsp yeast\n1 tsp salt\n1 tsp sugar\n2 tbsp oil", "Method", "Mix yeast with warm water and sugar. Combine flour and salt. Add yeast mixture and oil. Knead well. Let rise for 1 hour. Shape and bake at 425°F for 25-30 minutes until golden.", R.drawable.khobz));

            recipes1.add(new Recipes("Garlic Bread", "4 cups flour\n1 1/2 cups warm water\n2 tsp yeast\n1 tsp salt\n1 tsp sugar\n2 tbsp oil", "Method", "Mix yeast with warm water and sugar. Combine flour and salt. Add yeast mixture and oil. Knead well. Let rise for 1 hour. Shape and bake at 425°F for 25-30 minutes until golden.", R.drawable.khobz));

            recipes1.add(new Recipes("Banana Bread", "2 cups flour\n1 cup warm water\n1 tsp yeast\n1 tsp salt\n1 tbsp olive oil\nSesame seeds", "Method", "Mix yeast with warm water. Combine flour and salt. Add yeast mixture and oil. Knead until smooth. Let rise for 45 minutes. Shape into flat rounds, sprinkle with sesame seeds. Bake at 450°F for 15-20 minutes.", R.drawable.matlou3));
            recipes1.add(new Recipes("Focaccia", "3 cups semolina flour\n1 cup warm water\n1 tsp salt\n1 tsp sugar\n2 tsp active dry yeast\n2 tbsp olive oil", "Method", "Mix yeast with warm water and sugar. Let foam for 5 minutes. Mix flour and salt in a bowl. Add yeast mixture and oil. Knead until smooth. Let rise for 1 hour. Shape into rounds and bake at 400°F for 20-25 minutes.", R.drawable.kesra));

            recipes1.add(new Recipes("Whole Wheat Bread", "4 cups flour\n1 1/2 cups warm water\n2 tsp yeast\n1 tsp salt\n1 tsp sugar\n2 tbsp oil", "Method", "Mix yeast with warm water and sugar. Combine flour and salt. Add yeast mixture and oil. Knead well. Let rise for 1 hour. Shape and bake at 425°F for 25-30 minutes until golden.", R.drawable.khobz));


        } else if (category.equals("Dessert")) {
            // Algerian desserts only
            recipes1.add(new Recipes("Makroud", "2 cups semolina, dates...", "Method", "Mix semolina...", R.drawable.makrout));
            recipes1.add(new Recipes("Samsa", "1 cup almonds, 1 cup sugar...", "Method", "Prepare filling...", R.drawable.samsa));
            recipes1.add(new Recipes("Kalb el louz", "2 cups semolina, 1 cup sugar...", "Method", "Prepare syrup and dough...", R.drawable.kalbelouz));
            recipes1.add(new Recipes("Griwach", "2 cups flour, 1 egg, orange blossom water...", "Method", "Mix ingredients, form shapes, fry, then dip in honey...", R.drawable.griwech));
            recipes1.add(new Recipes("Chocolate Lava Cake", "2 cups semolina, dates...", "Method", "Mix semolina...", R.drawable.makrout));
            recipes1.add(new Recipes("Tiramisu", "1 cup almonds, 1 cup sugar...", "Method", "Prepare filling...", R.drawable.samsa));
            recipes1.add(new Recipes("Strawberry Cheesecake", "2 cups semolina, 1 cup sugar...", "Method", "Prepare syrup and dough...", R.drawable.kalbelouz));
            recipes1.add(new Recipes("Creme Brulee", "2 cups flour, 1 egg, orange blossom water...", "Method", "Mix ingredients, form shapes, fry, then dip in honey...", R.drawable.griwech));

        }


        // Set up RecyclerView
        myrecyclerView = findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this, recipes1);
        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myrecyclerView.setAdapter(myAdapter);
    }
}