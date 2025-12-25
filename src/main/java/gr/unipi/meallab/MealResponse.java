package gr.unipi.meallab;

import com.fasterxml.jackson.annotation.JsonProperty;

   //MealResponse is a POJO class that acts as a container for the API results (meal).

public class MealResponse {

	// @JsonProperty maps the "meals" list from JSON to a Java array.
	// The array is private to ensure encapsulation.
    @JsonProperty("meals")
    private Recipe[] meals; 

    // Getter and Setter for meals
    public Recipe[] getMeals() {
        return meals;
    }

    public void setMeals(Recipe[] meals) {
        this.meals = meals;
    }
}