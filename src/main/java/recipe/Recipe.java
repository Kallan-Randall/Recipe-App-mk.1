package recipe;

import java.time.LocalDateTime;

public record Recipe(
    Integer id,
    String name,
    String description,
    String ingredients,
    String directions,
    String notes,
    Integer creator_id,
    LocalDateTime date_created
) {
}
