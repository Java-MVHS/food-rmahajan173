/* 
 * Riya Mahajan
 * 10-23-2024
 * Pizza.java
*/
public class Pizza extends Food //child class to Food
{
	public Pizza (String ingredientIn) //overload to Food
	{  
		
		super("baked", ingredientIn, "pizza"); //pass in parameters to Food

	} 
	public Pizza (String ingredientIn, String nameIn)//overload more for DeepDishPizza
	{
		
		super("baked", ingredientIn, nameIn); //pass in parameters to DeepDishPizza
		
	}
	
}




