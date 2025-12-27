package gr.unipi.meallab;

public class MainTest {
    public static void main(String[] args) {
        
        // 1. Test Searching
        System.out.println("1. Αναζήτηση");
        Recipe[] results = MealApiClient.searchRecipes("tomato");
        // Use a loop to print all the titles in the list
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i].getTitle());
        }

        // 2. Test Random Recipe
        System.out.println("\n2. Τυχαία συνταγή");
        Recipe random = MealApiClient.getRandomRecipe();
        if (random != null) {
            System.out.println("Συνταγή: " + random.getTitle());
        }

        // 3. Test getting details by ID
        System.out.println("\n3. Λεπτομέρειες για τη συνταγή 52772");
        Recipe details = MealApiClient.getDetailsById("52772");
        
           {
            System.out.println("Συνταγή: " + details.getTitle());
            System.out.println("Κατηγορία: " + details.getCategory());
            System.out.println("Προέλευση: " + details.getArea());
            System.out.println("Οδηγίες: " + details.getInstructions());
            System.out.println("Υλικά:");
            
            String[] ingredients = details.getIngredientsArray();
            String[] measures = details.getMeasuresArray();
            
            // Loop through the 20 positions of the arrays
            for (int i = 0; i < ingredients.length; i++) {
            	// If the ingredient is not null or empty, print it with its measure
                if (ingredients[i] != null && !ingredients[i].isEmpty()) {
                    System.out.println(measures[i] + " " + ingredients[i]);
                }
            }
        }
    }
}
