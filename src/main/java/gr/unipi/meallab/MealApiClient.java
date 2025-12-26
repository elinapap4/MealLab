package gr.unipi.meallab;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.net.URL;

public class MealApiClient {

    // 1. Static method for searching recipes by name
    public static Recipe[] searchRecipes(String userInput) {
    	
    	
        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        //Happy path
        try {
        	//Build the link and convert it to a URL java object
            String link = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + userInput;
            URL url = java.net.URI.create(link).toURL();
            
            // Deserialize JSON data from the URL into a MealResponse object
            MealResponse response = objectMapper.readValue(url, MealResponse.class);
            
             // Check if the response is not null before returning
            if (response.getMeals() != null) {
                return response.getMeals();
            }          
          //Exception handling
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Return an empty array in case of exception
        return new Recipe[0];
    }
    

    // 2. Static method for getting recipe details by ID
    public static Recipe getDetailsById(String requestedID) {
    	
    	
        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        
      //Happy path
        try {
        	//Build the link and convert it to a URL java object
            String link = "https://www.themealdb.com/api/json/v1/1/lookup.php?i=" + requestedID;
            URL url = java.net.URI.create(link).toURL();
            
            // Deserialize JSON data from the URL into a MealResponse object
            MealResponse response = objectMapper.readValue(url, MealResponse.class);
            
           // Check if the response is not null before returning
           if (response.getMeals() != null) {
                return response.getMeals()[0];
            }
          //Exception handling
        } catch (Exception e) {
            e.printStackTrace();
        }
      //Return null in case of exception
        return null;
    }

    // 3. Static method for getting a random recipe
    public static Recipe getRandomRecipe() {
    	
    	
        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
      //Happy path
        try {
        	//Build the link and convert it to a URL java object
            String link = "https://www.themealdb.com/api/json/v1/1/random.php";
            URL url = java.net.URI.create(link).toURL();
            
            // Deserialize JSON data from the URL into a MealResponse object
            MealResponse response = objectMapper.readValue(url, MealResponse.class);
            
            // Check if the response is not null before returning
            if (response.getMeals() != null) {
                return response.getMeals()[0];
            }
          //Exception handling
        } catch (Exception e) {
            e.printStackTrace();
        }
      //Return an empty array in case of exception
        return null;
    }
}