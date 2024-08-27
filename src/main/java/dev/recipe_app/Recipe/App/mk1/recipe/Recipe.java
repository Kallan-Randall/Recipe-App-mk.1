package dev.recipe_app.Recipe.App.mk1.recipe;

import java.time.LocalDateTime;

public record Recipe(
    Integer recipe_id,
    String name,
    String description,
    String ingredients,
    String directions,
    String notes,
    Integer creator_id,
    LocalDateTime date_created
) {
}
