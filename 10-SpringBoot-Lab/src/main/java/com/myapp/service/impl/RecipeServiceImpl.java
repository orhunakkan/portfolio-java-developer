package com.myapp.service.impl;

import com.github.javafaker.Faker;
import com.myapp.enums.QuantityType;
import com.myapp.enums.RecipeType;
import com.myapp.model.Ingredient;
import com.myapp.model.Recipe;
import com.myapp.repository.RecipeRepository;
import com.myapp.service.RecipeService;
import com.myapp.service.ShareService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class RecipeServiceImpl implements RecipeService {

    private final ShareService shareService;
    private final RecipeRepository recipeRepository;
    private final Faker faker;

    public RecipeServiceImpl(ShareService shareService, RecipeRepository recipeRepository, Faker faker) {
        this.shareService = shareService;
        this.recipeRepository = recipeRepository;
        this.faker = faker;
    }

    @Override
    public void prepareRecipe() {
        Recipe recipe = new Recipe();
        recipe.setRecipeId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(generateRandomValue());
        recipe.setPreparation(faker.lorem().paragraph(5));
        recipe.setRecipeType(RecipeType.BREAKFAST);
        recipe.setIngredients(prepareIngredients());
        recipeRepository.saveRecipe(recipe);
        shareService.shareRecipe(recipe);
    }

    private List<Ingredient> prepareIngredients() {
        List<Ingredient> ingredientList = new ArrayList<>();
        for (int i = 0; i < generateRandomValue(); i++) {
            Ingredient ingredient = new Ingredient();
            ingredient.setName(faker.food().ingredient());
            ingredient.setQuantity(generateRandomValue());
            ingredient.setQuantityType(QuantityType.TBSP);
            ingredientList.add(ingredient);
        }
        return ingredientList;
    }

    private int generateRandomValue() {
        return new Random().nextInt(20) + 1;
    }
}
