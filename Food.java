/* 
 * Riya Mahajan
 * 10-23-2024
 * Food.java
*/

public class Food
{
	protected String str; //create String to initalize and call
	
	public Food ()
	{
		str = new String(""); //new string, so it clears out the string e. time to renew it
	}
	
	public Food (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
		//initalizes str to a String 
	}

	public void printForSale()
	{
		System.out.println(str); //prints strs' String
	}
}
