package dev.recipe_app.Recipe.App.mk1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import dev.recipe_app.Recipe.App.mk1.recipe.Recipe;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Application started successfully on port {}", 8080);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Recipe recipe = new Recipe(1, "test", "test", "test", "test", "test", 1, LocalDateTime.now());
			log.info("recipe: " + recipe);
		};

	}

}
