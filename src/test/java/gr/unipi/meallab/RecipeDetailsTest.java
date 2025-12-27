package gr.unipi.meallab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecipeDetailsTest {

    @Test
    void testRecipeDetails() {
        // Get a specific recipe using a known ID
        Recipe details = MealApiClient.getDetailsById("52772");
        
        // Verify the name of this specific recipe
        assertEquals("Teriyaki Chicken Casserole", details.getTitle());
        
        // Check if the details are not null
        assertNotNull(details.getInstructions());
        assertNotNull(details.getThumbUrl());
        assertNotNull(details.getCategory());
        assertNotNull(details.getArea());
        
        // Check if the ingredients and measurements are not null
        String[] ingredients = details.getIngredientsArray();
        assertNotNull(ingredients);
        
        String[] measures = details.getMeasuresArray();
        assertNotNull(measures);
    }
}