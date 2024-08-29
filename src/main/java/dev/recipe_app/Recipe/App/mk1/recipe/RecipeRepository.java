package dev.recipe_app.Recipe.App.mk1.recipe;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {
    
    private List<Recipe> recipes = new ArrayList<>();
    
    List<Recipe> findAll() {
        return recipes;
    }
    
    @PostConstruct
    private void init() {
        recipes.add(new Recipe(1,
                "testName",
                "testDescription",
                "testIngredients",
                "testDirections",
                "test",
                1,
                LocalDateTime.now()));

        recipes.add(new Recipe(2,
                "testName",
                "testDescription",
                "testIngredients",
                "testDirections",
                "test",
                1,
                LocalDateTime.now()));
    }
    
}
