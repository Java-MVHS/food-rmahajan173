/* 
 * Riya Mahajan
 * 10-23-2024
 * FoodTester.java
*/
public class FoodTester3
{
	
	 public static void main(String[] args) //main is complete 
	{ 
		FoodTester3 ft = new FoodTester3();  //create new FoodTester3 to call nonstatic methods
		ft.print3Lines();

		//create instance for e. food object and initalize 
		Food3 food1 = new Food3 ("baked", "banana", "muffin", 50, 12);
		food1.printForSale();
		Food3 food2	= new Food3 ("fried", "yam", "fritter", 100, 3);
		food2.printForSale();
		Pizza3 pizza = new Pizza3 ("anchovies", "pizza", 250, 8);
		pizza.printForSale();
		
		ft.print3Lines();

	}
	public void print3Lines() //new method for 3 lines
	{
		System.out.println ("\n\n\n");
	}
	
}

