package gr.unipi.meallab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SearchFeatureTest {

    @Test
    void testSearch() {
        // Insert a valid meal with many results
        Recipe[] results = MealApiClient.searchRecipes("chicken");
        
        // Check if we found at least one recipe
        assertTrue(results.length > 0);
    }

    @Test
    void testInvalidSearch() {
        // Search for something that does not exist
        Recipe[] results = MealApiClient.searchRecipes("abcdefghijklmnop");
        
        // Check if the array is empty 
        assertEquals(0, results.length);
    }
}

