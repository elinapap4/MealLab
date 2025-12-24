package gr.unipi.meallab;

import com.fasterxml.jackson.annotation.JsonProperty;

   //Recipe is a POJO class.
   //It represents a recipe and maps JSON data from TheMealDB API 
   //into Java objects using Jackson annotations.

public class Recipe { 
	
    // @JsonProperty is used for mapping JSON fields to Java fields.
	// Fields are private to ensure encapsulation. 
	
    @JsonProperty("idMeal")
    private String id;
    @JsonProperty("strMeal")
    private String title;
    @JsonProperty("strInstructions")
    private String instructions;
    @JsonProperty("strMealThumb")
    private String thumbUrl;

    // API provides up to 20 individual ingredient fields.
    
    @JsonProperty("strIngredient1") private String i1;
    @JsonProperty("strIngredient2") private String i2;
    @JsonProperty("strIngredient3") private String i3;
    @JsonProperty("strIngredient4") private String i4;
    @JsonProperty("strIngredient5") private String i5;
    @JsonProperty("strIngredient6") private String i6;
    @JsonProperty("strIngredient7") private String i7;
    @JsonProperty("strIngredient8") private String i8;
    @JsonProperty("strIngredient9") private String i9;
    @JsonProperty("strIngredient10") private String i10;
    @JsonProperty("strIngredient11") private String i11;
    @JsonProperty("strIngredient12") private String i12;
    @JsonProperty("strIngredient13") private String i13;
    @JsonProperty("strIngredient14") private String i14;
    @JsonProperty("strIngredient15") private String i15;
    @JsonProperty("strIngredient16") private String i16;
    @JsonProperty("strIngredient17") private String i17;
    @JsonProperty("strIngredient18") private String i18;
    @JsonProperty("strIngredient19") private String i19;
    @JsonProperty("strIngredient20") private String i20;

    // Getters and Setters for each field
    public String getId() 
    { return id; }
    public void setId(String id) 
    { this.id = id; }
    
    public String getTitle() 
    { return title; }
    public void setTitle(String title) 
    { this.title = title; }
    
    public String getInstructions() 
    { return instructions; }
    public void setInstructions(String instructions)
    { this.instructions = instructions; }
    
    public String getThumbUrl()
    { return thumbUrl; }
    public void setThumbUrl(String thumbUrl) 
    { this.thumbUrl = thumbUrl; }
    
   // Groups the 20 individual ingredients into one static array 
   // so we can display them easily using a loop in the UI.
    public String[] getIngredientsArray() {
      
        String[] ingredients = new String[20];
        
        ingredients[0] = i1;
        ingredients[1] = i2;
        ingredients[2] = i3;
        ingredients[3] = i4;
        ingredients[4] = i5;
        ingredients[5] = i6;
        ingredients[6] = i7;
        ingredients[7] = i8;
        ingredients[8] = i9;
        ingredients[9] = i10;
        ingredients[10] = i11;
        ingredients[11] = i12;
        ingredients[12] = i13;
        ingredients[13] = i14;
        ingredients[14] = i15;
        ingredients[15] = i16;
        ingredients[16] = i17;
        ingredients[17] = i18;
        ingredients[18] = i19;
        ingredients[19] = i20;
        
        return ingredients;
    }

}