/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.recipe;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
class RecipeController{
    RecipeService recipeService=new RecipeService();

    @GetMapping("/recipes")
    public List<Recipe> getRecipes(){
        return recipeService.getRecipes();
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    }    
    @GetMapping("/recipes/{recipeId}")
    public Recipe getRrecipeById(@PathVariable ("recipeId") int recipeId){
        return recipeService.getRrecipeById(recipeId);
    }
    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable ("recipeId") int recipeId,@RequestBody Recipe recipe){
        return recipeService.updateRecipe(recipeId,recipe);
    }
    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable ("recipeId") int recipeId){
        recipeService.deleteRecipe(recipeId);
    }
    
}