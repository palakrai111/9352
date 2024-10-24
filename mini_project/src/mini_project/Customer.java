package mini_project;
import java.util.*;

public class Customer extends Restaurant_Owner implements GST {
	/*
	 * "order" HashMap to store the food items and its quantity ordered by customer.
	 * GST is an interface which has GSTInterestRate
	 */
	HashMap<String,Integer> order;
		GST gst;
	Customer(){
		order=new HashMap<String,Integer>();
		gst=null;
	}
	void displayMenu()
	{
		super.displayMenu();
	}
	void displayOrder()
	{
		/*
		 * Check if the order HashMap is empty. If its empty then return, else display
		 * all the food items and its quantity ordered by customer.
		 */
		if(order.isEmpty()) {
			System.out.println("No Items In Order.");
		}
		Set<String> foodNames=new HashSet<String>();
		foodNames=order.keySet();
		System.out.println("-------------------------------------");
		System.out.println("FOOD \t QUANTITY \t PRICE \t TOTAL");
		System.out.println("-------------------------------------");
		
		for(String food: foodNames)
		{
			System.out.println(food + "\t" + order.get(food) + "\t" + menu.get(food) + "\t"    //order.get(food) gives quant ,menu.get(food) gives price 
					+ menu.get(food) * order.get(food));
		}
		System.out.println("-------------------------------------\n");
	}
	boolean orderFood(String food,int quantity)
	{
		/*
		 * Check if the menu contains the food item ordered by the customer. If it does
		 * not exist in menu return false, else add the food item in customer's order.
		 */
		if(!super.menu.containsKey(food))
			return false;
		order.put(food, quantity);
		return true;
	}
	boolean removeFood(String food)
	{
		/*
		 * Check if the order contains the food item ordered by the customer. If it does
		 * not exist in order return false, else remove the food item from customer's
		 * order.
		 */
		if(!order.containsKey(food))
			return false;
		else
			order.remove(food);
		return true;
	}
	boolean update(String food,int quantity) {
		
		if(order.containsKey(food)) {
			order.put(food, quantity);
		}
		else {
			return false;
		}
		return true;
		
	}
	double totalBill()
	{
		/*
		 * calculate the total amount for the food items ordered including GST.
		 */
		double amount=0;
		Set<String> foodNames=new HashSet<String>();
		foodNames=order.keySet();
		for(String food: foodNames) {
			amount+=(super.menu.get(food)*order.get(food));
		}
		double tax=gst.GST_Tax_Percent*amount/100;
		return amount+tax; 
	}

}
