// Write your code here
package com.example.recipe;

import java.util.*;
public interface RecipeRepository{
    List<Recipe> getRecipes();
    Recipe addRecipe(Recipe recipe);
    Recipe getRrecipeById(int recipeId);
    Recipe updateRecipe(int recipeId,Recipe recipe);
    void deleteRecipe(int recipeId);

    //Recipe addRecipe(Recipe recipe);
    /*Song getSongById(int songId);
    Song updateSong(int songId,Song song);
    void deleteSong(int songId);*/
}