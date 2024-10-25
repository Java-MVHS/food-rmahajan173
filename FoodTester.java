/* 
 * Riya Mahajan
 * 10-23-2024
 * FoodTester.java
*/
public class FoodTester 
{	
	public static void main (String [] args) // main is complete 
	{ 
		FoodTester3 ft = new FoodTester3();  //create new FoodTester to call nonstatic methods
		ft.print3Lines();
		
		//create instance for e. food object and initalize 
		Food food1 = new Food ("baked",	"banana", "muffins");
		food1.printForSale();
		Food food2	= new Food ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza pizza = new Pizza ("pepperoni", "pizza");
		pizza.printForSale();
		
		ft.print3Lines();


	}
	public void print3Lines() //new method for 3 lines
	{
		System.out.println ("\n\n\n"); //prints 3 new lines
	}
}

