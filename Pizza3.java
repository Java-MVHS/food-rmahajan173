/* 
 * Riya Mahajan
 * 10-23-2024
 * Pizza.java
*/
public class Pizza3 extends Food3 //child class to Food3
{
	public Pizza3 (String ingredientIn, int centsPerPiece, int amtObjects) //overload to Food3
	{  
		
		super("baked", ingredientIn, "pizza", centsPerPiece, amtObjects); //pass in parameters to Food3

	} 
	public Pizza3 (String ingredientIn, String nameIn, int centsPerPiece, int amtObjects) //overload more for DeepDishPizza3
	{
		
		super("baked", ingredientIn, nameIn, centsPerPiece, amtObjects); //pass in parameters to DeepDishPizza3
		
	}
	
}




