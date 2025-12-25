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
    @JsonProperty("strCategory")
    private String category;
    @JsonProperty("strArea")
    private String area;
    

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
    
    
    @JsonProperty("strMeasure1") private String m1;
    @JsonProperty("strMeasure2") private String m2;
    @JsonProperty("strMeasure3") private String m3;
    @JsonProperty("strMeasure4") private String m4;
    @JsonProperty("strMeasure5") private String m5;
    @JsonProperty("strMeasure6") private String m6;
    @JsonProperty("strMeasure7") private String m7;
    @JsonProperty("strMeasure8") private String m8;
    @JsonProperty("strMeasure9") private String m9;
    @JsonProperty("strMeasure10") private String m10;
    @JsonProperty("strMeasure11") private String m11;
    @JsonProperty("strMeasure12") private String m12;
    @JsonProperty("strMeasure13") private String m13;
    @JsonProperty("strMeasure14") private String m14;
    @JsonProperty("strMeasure15") private String m15;
    @JsonProperty("strMeasure16") private String m16;
    @JsonProperty("strMeasure17") private String m17;
    @JsonProperty("strMeasure18") private String m18;
    @JsonProperty("strMeasure19") private String m19;
    @JsonProperty("strMeasure20") private String m20;

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
    
    public String getCategory() 
    { return category; }
    public void setCategory(String category) 
    { this.category = category; }

    public String getArea() 
    { return area; }
    public void setArea(String area)
    { this.area = area; }
    
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
    
    public String[] getMeasuresArray() {
        String[] measures = new String[20];
        measures[0] = m1;
        measures[1] = m2;
        measures[2] = m3;
        measures[3] = m4;
        measures[4] = m5;
        measures[5] = m6;
        measures[6] = m7;
        measures[7] = m8;
        measures[8] = m9;
        measures[9] = m10;
        measures[10] = m11;
        measures[11] = m12;
        measures[12] = m13;
        measures[13] = m14;
        measures[14] = m15;
        measures[15] = m16;
        measures[16] = m17;
        measures[17] = m18;
        measures[18] = m19;
        measures[19] = m20;
        return measures;
    }

}