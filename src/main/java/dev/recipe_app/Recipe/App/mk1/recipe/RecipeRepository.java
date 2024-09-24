package dev.recipe_app.Recipe.App.mk1.recipe;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RecipeRepository {
    
    private List<Recipe> recipes = new ArrayList<>();
    
    List<Recipe> findAll() {
        return recipes;
    }

    Optional<Recipe> findById(Integer id) {
        return recipes.stream()
                .filter(recipe -> recipe.recipe_id() == id)
                .findFirst();
    }

    void create(Recipe recipe) {
        recipes.add(recipe);
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
