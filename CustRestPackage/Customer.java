package CustRestPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Customer extends Restaurant
{
	
	HashMap<String, Integer> order = null;
	Customer()
	{
		order = new HashMap<String, Integer>(); 
		//food, quantity
		order.put("idli",3);
		order.put("dosa",2);
	}
	

	
	 void displayMenuToUser()
	 {
		 super.dispaly();
	 }
	 
	 void displayOrder()
	 { 
		 System.out.println("food \t price \t quantity \t total");
		 
		 Set<String> s= new HashSet();
  	   s = order.keySet(); //[idli,dosa...]
  	     int total = 0;
  	     int totalbill =0;
  	   for(String foodname : s)
  	   {
  		  total =  menu.get(foodname) * order.get(foodname);
  		   System.out.println(foodname + "\t " + menu.get(foodname) + "\t"+order.get(foodname)+"\t" + total);
  		 totalbill += total;
  	   }
	System.out.println("total bill amount is :" + totalbill);
	 }
}
