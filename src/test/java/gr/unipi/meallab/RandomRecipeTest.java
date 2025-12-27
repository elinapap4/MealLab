package gr.unipi.meallab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RandomRecipeTest {

    @Test
    void testRandom() {
        // Call the method for a single random recipe from the Client
        Recipe random = MealApiClient.getRandomRecipe();
        
        // Check if the response is not null
        assertNotNull(random);
    }
}