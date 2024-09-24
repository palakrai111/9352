package Strog;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1 = "keep";
  String s2 = "peas";
  String s3 = "paeiou*** aa e***rrr";
  
  String x = s3.substring(5);
  String y =s3.replace('a','*');
  System.out.println("replaced name"+y);
  System.out.println("name"+x);
  String z = s3.replaceAll("[aeiouAEIOU]","*");
 String x1= s3.replace("[aeiou]", "z");
 //System.out.println("replace" + s3);
 System.out.println("new_output"+z);
  
       if(s1.length() == s2.length())
       {
    	   char c1[] = s1.toCharArray();
    	   char c2[] = s2.toCharArray();
    	   Arrays.sort(c1);
    	   Arrays.sort(c2);
    	   boolean b = Arrays.equals(c1,c2);
    	   if(b)
    	   { System.out.println("anagam");}
    	   else { System.out.println("not anagam");}
    	   
    	   
    	   
       }
       else 
       {
    	   System.out.println("no anagam");
       }
  
	}

}
