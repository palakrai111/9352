package CustRestPackage;

import java.util.*;

public class Restaurant 
{
       HashMap<String, Integer> menu = null;
       Restaurant()
       {
    	   menu = new HashMap<String, Integer>();
    	   
    	   menu.put("idli",30);
    	   menu.put("dosa",20);
    	   menu.put("vada",10);
    	   menu.put("poori",30);
       }
       
       void dispaly()
       {
    	   Set<String> s= new HashSet();
    	   s = menu.keySet(); //[idli,dosa...]
    	   System.out.println("food \t prise \t");
    	   for(String foodname : s)
    	   {
    		   System.out.println(foodname + "\t " + menu.get(foodname));
    	   }
       }
}
