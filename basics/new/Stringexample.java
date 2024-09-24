package Strog;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   String s1 = new String("Hello world new");    //String 1  
	        String s2 = new String(" World");    //String 2  
	        String s = String.join("*",s1,s2);   //String 3 to store the result  
	            System.out.println(s);  //Displays result  
	           int scount = 0;
	            int ccount= 0;
	            for(int i = 0; i < s1.length();i++)
	            {
	            	if(s1.charAt(i) != ' ')
	            	{
	            		ccount++;
	            		//System.out.println(ccount);
	            	}else
	            	{
	            		scount++;
	            		//System.out.println(scount);
	            	}
	            }
	            
	            
	            System.out.println(ccount);
	            System.out.println(scount);
	}

}
