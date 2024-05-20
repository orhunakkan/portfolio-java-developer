package com.myapp.service.impl;

import com.myapp.model.Recipe;
import com.myapp.service.ShareService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FacebookShareServiceImpl implements ShareService {

    @Override
    public boolean shareRecipe(Recipe recipe) {
        System.out.println("Shared on Facebook!");
        System.out.println("RecipeType: " + recipe.getRecipeType());
        System.out.println("Recipe Name: " + recipe.getName());
        System.out.println("Ingredient List: ");

        recipe.getIngredients().forEach(ingredients ->
                System.out.println("    Ingredient Name: " + ingredients.getName() + " Quantity: " +
                        ingredients.getQuantity() + " " + ingredients.getQuantityType())
        );

        System.out.println("Preparation: \n" + "\t" + recipe.getPreparation());
        return true;
    }
}
