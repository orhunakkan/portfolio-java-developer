package com.myapp.repository;

import com.myapp.model.Recipe;

public interface RecipeRepository {

    boolean saveRecipe(Recipe recipe);

}
