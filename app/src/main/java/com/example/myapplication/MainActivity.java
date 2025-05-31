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

            recipes1.add(new Recipes("Pancakes",
                    "1 cup flour\n2 tbsp sugar\n1 egg\n1 cup milk\n1 tsp baking powder\n1 tbsp melted butter",
                    "Method",
                    "Mix dry ingredients, then add egg, milk, and butter.\nStir until smooth.\nCook on a hot non-stick pan until golden on both sides.",
                    R.drawable.pancakes));

            recipes1.add(new Recipes("Omelette",
                    "2 eggs\n1 tbsp milk\nSalt and pepper\nChopped onions, tomatoes, herbs",
                    "Method",
                    "Beat eggs with milk, salt, and pepper.\nAdd veggies.\nPour into a heated non-stick pan and cook until set.",
                    R.drawable.omelette));

            recipes1.add(new Recipes("Avocado Toast",
                    "2 slices bread\n1 ripe avocado\nSalt, pepper, lemon juice\nChili flakes (optional)",
                    "Method",
                    "Toast bread slices.\nMash avocado with lemon juice, salt, and pepper.\nSpread on toast and top with chili flakes.",
                    R.drawable.avocado_toast));

            recipes1.add(new Recipes("French Toast",
                    "2 slices bread\n1 egg\n1/4 cup milk\nCinnamon, vanilla (optional)\nButter for cooking",
                    "Method",
                    "Whisk egg, milk, cinnamon, and vanilla.\nDip bread and cook in butter on both sides until golden.",
                    R.drawable.french_toast));

            recipes1.add(new Recipes("Smoothie Bowl",
                    "1 banana\n1/2 cup berries\n1/2 cup yogurt or milk\nToppings: granola, fruit, seeds",
                    "Method",
                    "Blend banana, berries, and yogurt until smooth.\nPour into a bowl and add your favorite toppings.",
                    R.drawable.smoothie_bowl));

            recipes1.add(new Recipes("Ful Medames",
                    "1 can fava beans\n1 clove garlic\nOlive oil, lemon juice\nSalt, cumin\nChopped parsley, boiled egg (optional)",
                    "Method",
                    "Mash beans with garlic, lemon juice, and spices.\nDrizzle with olive oil and serve with bread.",
                    R.drawable.ful_medames));

            recipes1.add(new Recipes("Msemmen (Algerian Pancake)",
                    "2 cups flour\n1/2 tsp salt\nWater to mix\nOil and semolina for folding",
                    "Method",
                    "Knead flour and water into a soft dough.\nRoll and fold with oil and semolina.\nCook on a hot pan until golden.",
                    R.drawable.msemmen));

            recipes1.add(new Recipes("Croissant Breakfast",
                    "2 eggs\n1 tomato\n1/2 onion\n1 clove garlic\nPaprika, cumin\nSalt, pepper",
                    "Method",
                    "Cook onion and garlic, add chopped tomato and spices.\nSimmer, then crack eggs on top and cook until whites set.",
                    R.drawable.shakshuka));

        } else if (category.equals("Indian")) {
            // Indian recipes
            recipes1.add(new Recipes("Dosa", "3 cups rice\n1 cup urad daal (split, skinless black gram)\n3/4 teaspoon fenugreek seeds\nSalt (to taste)\nVegetable / canola / sunflower cooking oil", "Method", "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\nPut some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\nWhen the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\nThe dosa is almost done. Fold it in half and allow to cook for 30 seconds more.", R.drawable.dosa1));

            recipes1.add(new Recipes("Chicken Roll", "200 gm chopped into cubes chicken\n1 medium chopped tomato\n1/2 pinch red chilli powder\n2 tablespoon vegetable oil\n1/2 cut into strips cucumber\n1/2 tablespoon chopped coriander leaves\n1 large thinly sliced onion\n2 medium chopped green chilli\n2 pinches garam masala powder\n1 lemon wedges\n1 teaspoon tomato ketchup\n1 tablespoon green chilli sauce", "Method", "Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!", R.drawable.chicken_roll));
            recipes1.add(new Recipes("Butter Chicken",
                    "500g boneless chicken\n1 cup yogurt\n2 tbsp butter\n1 cup tomato puree\n1/2 cup cream\nSpices (turmeric, chili, garam masala)",
                    "Method",
                    "Marinate chicken in yogurt and spices for 1 hour.\nCook chicken until half done.\nIn another pan, melt butter, add tomato puree and cream.\nAdd chicken to the gravy and simmer until done.",
                    R.drawable.butter_chicken));

            recipes1.add(new Recipes("Biryani",
                    "2 cups basmati rice\n500g chicken or mutton\n1 cup yogurt\n2 onions\nWhole spices (bay leaf, cloves, cardamom)\nSaffron (optional)",
                    "Method",
                    "Marinate meat with yogurt and spices.\nCook rice until 70% done.\nLayer meat and rice, sprinkle saffron and fried onions.\nCook on low flame (dum) for 20–30 minutes.",
                    R.drawable.biryani));

            recipes1.add(new Recipes("Chole Bhature",
                    "2 cups chickpeas\n2 onions\n2 tomatoes\nSpices (cumin, garam masala, chili powder)\nFor Bhature: Flour, yogurt, baking powder",
                    "Method",
                    "Soak and cook chickpeas, prepare gravy with onions, tomatoes, and spices.\nKnead dough for bhature and rest 2 hours.\nRoll and deep fry until puffed and golden.",
                    R.drawable.chole_bhature));

            recipes1.add(new Recipes("Paneer Tikka",
                    "250g paneer cubes\n1 cup yogurt\nSpices (turmeric, chili, cumin)\nBell peppers and onions",
                    "Method",
                    "Marinate paneer and veggies in yogurt and spices for 1 hour.\nGrill or bake on skewers until golden.\nServe with green chutney.",
                    R.drawable.paneer_tikka));


        } else if (category.equals("Soups & Stews")) {
            // Soups & Stews recipes
            recipes1.add(new Recipes("Chorba frik", "1/2 cup frik (cracked wheat)\n1/2 lb lamb or chicken\n1 onion, chopped\n2 tomatoes, grated\n1 tbsp tomato paste\n1/4 cup chickpeas (soaked overnight)\n1 tsp paprika\n1 tsp cumin\nSalt & pepper\nChopped parsley & coriander", "Method", "In a large pot, sauté onion and meat in oil until browned. Add tomatoes, paste, and spices. Cook a few minutes, then add chickpeas and 1.5 L water. Bring to a boil. Add frik and simmer until chickpeas are tender. Finish with parsley and coriander.", R.drawable.chorba));

            recipes1.add(new Recipes("Hrira", "1/2 cup lentils\n1/4 cup rice\n1 onion, chopped\n2 tomatoes, chopped\n1/4 cup chickpeas\n1 tsp cinnamon\n1 tsp ginger\nSalt & pepper\nFresh herbs", "Method", "Traditional Moroccan soup perfect for breaking fast. Soak lentils and chickpeas overnight. Sauté onions, add tomatoes and spices. Add lentils, chickpeas and water. Simmer until tender. Add rice and cook until soft. Season and garnish with herbs.", R.drawable.hrira));

            recipes1.add(new Recipes("Chorba Beida", "6 eggs\n1 onion, chopped\n2 tomatoes, chopped\n1 tsp turmeric\n1 tsp paprika\nSalt & pepper\nFresh parsley\nOlive oil", "Method", "Heat oil in pan, sauté onions until soft. Add tomatoes and spices, cook until thick. Beat eggs and pour into pan. Scramble gently until eggs are cooked. Season with salt, pepper and fresh parsley.", R.drawable.beida));


            recipes1.add(new Recipes("Tomato Basil Soup",
                    "5 ripe tomatoes\n1 onion\n2 cloves garlic\nFresh basil\n1 cup broth\nSalt, pepper, olive oil",
                    "Method",
                    "Sauté onion and garlic.\nAdd tomatoes and broth.\nSimmer, blend until smooth.\nAdd basil and season to taste.",
                    R.drawable.tomato_soup));

            recipes1.add(new Recipes("Carrot Ginger Soup",
                    "4 carrots\n1 onion\n1 piece fresh ginger\n2 cups vegetable broth\nOlive oil, salt, pepper",
                    "Method",
                    "Sauté onion and ginger.\nAdd carrots and broth.\nSimmer until soft.\nBlend and season to taste.",
                    R.drawable.carrot_ginger));

            recipes1.add(new Recipes("Lentil Soup",
                    "1 cup red lentils\n1 onion\n2 carrots\n2 garlic cloves\n1 tsp cumin\n4 cups water or broth",
                    "Method",
                    "Sauté onion, garlic, carrots.\nAdd lentils, cumin, and broth.\nCook until lentils are soft, blend or serve as is.",
                    R.drawable.lentil_soup));

            recipes1.add(new Recipes("Chicken Noodle Soup",
                    "200g chicken breast\n1 onion\n1 carrot\n1 celery stick\n1/2 cup noodles\n2 cups broth",
                    "Method",
                    "Cook chicken, remove and shred.\nSauté veggies, add broth and noodles.\nAdd chicken and simmer until noodles are done.",
                    R.drawable.chicken_noodle));

            recipes1.add(new Recipes("Pumpkin Soup",
                    "2 cups pumpkin (chopped)\n1 onion\n2 garlic cloves\n1 cup milk or cream\nSpices: nutmeg, pepper, salt",
                    "Method",
                    "Sauté onion and garlic.\nAdd pumpkin and water, boil until soft.\nBlend and add cream and spices.",
                    R.drawable.pumpkin_soup));

            recipes1.add(new Recipes("Vegetable Soup",
                    "1 potato\n1 carrot\n1 zucchini\n1 tomato\n1/2 onion\nSalt, pepper, herbs",
                    "Method",
                    "Chop all veggies.\nBoil in water with herbs and seasoning until tender.\nServe hot.",
                    R.drawable.vegetable_soup));

            recipes1.add(new Recipes("Onion Soup",
                    "3 large onions\n1 tbsp butter\n2 cups beef broth\nSalt, pepper, thyme\nBread and cheese for topping",
                    "Method",
                    "Caramelize onions in butter.\nAdd broth and season.\nTop with bread and cheese, broil until golden.",
                    R.drawable.onion_soup));

            recipes1.add(new Recipes("Minestrone",
                    "1/2 cup pasta\n1 carrot\n1 zucchini\n1 tomato\n1/4 cup beans\nGarlic, onion, broth, herbs",
                    "Method",
                    "Sauté garlic, onion, and veggies.\nAdd broth, beans, and pasta.\nSimmer until pasta is cooked.",
                    R.drawable.minestrone));

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