/* 
 * Riya Mahajan
 * 10-23-2024
 * Food.java
*/

public class Food3
{
	protected String str; //create String to initalize and call
	
	public Food3 ()
	{
		str = new String(""); //new string, so it clears out the string e. time to renew it
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int centsPerPiece, int amtObjects)
	{	
		str = String.format("At the sale: %s %s with %s will be sold for %d cents each." +
		" With %d %s(s), $%.2f can be made.", name, prepMethod, ingredient, centsPerPiece, amtObjects, name, + 
		((centsPerPiece * amtObjects) / 100 * 1.0 )); 
		
		//initalize str by using String.format, complete all needed in the String
	}

	public void printForSale()
	{
		System.out.println(str); //print str
	}
	
}
