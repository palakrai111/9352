package mini_project;
import java.util.*;

public class Restaurant_Owner {
	/*
	 Static HashMap to store all the food items and their respective price in menu
	  Declared static so as to share same menu for all customers.
	 */
	static HashMap<String,Float> menu;
	Restaurant_Owner()
	{
		menu=new HashMap<String,Float>();
	}
	boolean authorize(String username,String password)
	{
		return username.equals("Restaurant") && password.equals("Rest123");
	}
	
	boolean addItem(String food,float price) {
		/*
		 * If menu already contains the food item don't add it in menu again and return
		 * false, Else add the food item in menu and return true.
		 */
		if(menu.containsKey(food)) {
			return false;
		}
		else {
			menu.put(food, price);
			return true;
		}
	}
	boolean deleteItem(String food)
	{
		/*
		 * First check if food item exists in menu. If exists then delete and return
		 * true, else return false
		 */
		if(menu.containsKey(food))
		{
			menu.remove(food);
			return true;
		}
		else {
			return false;
		}
	}
	boolean update(String food,float price)
	{
		if(menu.containsKey(food)) {
			//deleteItem(food);
			addItem(food,price);
			return true;
		}else
		{
			return false;
		}
		//return true; 
	}
	void displayMenu() {
		if(menu.isEmpty()) {
			System.out.println("Menu is Empty");
		}
		Set<String> foodNames=new HashSet<String>();
		foodNames=menu.keySet();
		System.out.println("-------------------------------------");
		System.out.println("FOOD \t PRICE");
		System.out.println("-------------------------------------");
		
		for(String food: foodNames) {
			System.out.println(food + "\t" + menu.get(food));   //menu.get returns values i.e price
		}
		System.out.println("-------------------------------------");
		
	}

}
