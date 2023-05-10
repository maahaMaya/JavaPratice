package assigment;
import java.util.*;
public class FoodBillGenerator {
	//price(Rs) of the food item
	static final int PIZZA_PRICE = 100;
	static final int PUFFS_PRICE = 20;
	static final int COLD_DRINK_PRICE = 10;
	
	public static void main(String[] args) {
		// initialize variables
		int totalPizzaOrder;
		int totalPuffsOrder;
		int totalColdDrinkOrder;
		
		Scanner sc = new Scanner(System.in);
		//taking the customer input for food
		System.out.print("Enter the number of pizza bought : ");
		totalPizzaOrder = sc.nextInt();
		System.out.println();
		System.out.print("Enter the number of puffs bought : ");
		totalPuffsOrder = sc.nextInt();
		System.out.println();
		System.out.print("Enter the number of cold drink bought : ");
		totalColdDrinkOrder = sc.nextInt();
		System.out.println();
		
		System.out.println("Bill details");
		System.out.println("No of Pizzas : " + totalPizzaOrder * totalPizzaOrder);
		System.out.println("No of Pizzas : " + totalPuffsOrder * totalPuffsOrder);
		System.out.println("No of Pizzas : " + totalColdDrinkOrder * totalColdDrinkOrder);
		System.out.println("Total Price : " + (totalPizzaOrder * totalPizzaOrder + totalPuffsOrder * totalPuffsOrder + totalColdDrinkOrder * totalColdDrinkOrder));
		System.out.println("ENJOY THE SHOW!!!");
	}

}
