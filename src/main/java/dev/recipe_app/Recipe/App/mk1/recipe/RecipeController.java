package dev.recipe_app.Recipe.App.mk1.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @GetMapping("/home")
    String home() {
        return "Hello World from Recipe App";
    }
}
