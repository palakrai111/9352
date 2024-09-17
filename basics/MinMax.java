package Strog;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {11,15,20,0,25};
        
        int b[][] = new int[2][2];
       // Arrays.sort(a);
        
         int max =a[0];
         int min= a[0];
         for(int i = 0 ; i< a.length;i++)
         {
        	 if(a[i] > max)
        	 {
        		 max = a[i];   //25
        	 }
        	 
         
        	 
         }
         
         for(int i = 0 ; i< a.length;i++)
         {
        	 if(a[i] < min)
        	 {
        		 min = a[i];  
        	 }
        	 
         
        	 
         }
         
         System.out.println("max"+max);
         System.out.println("min"+min);
         
         int marks[] = {34,30,100,70,90};
         int sum = 0;
         for(int j = 0 ; j < marks.length; j++)
         {
        	 if(marks[j] < 35)
        	 {
        		 System.out.println("Student fail");
        	 }
        	 else
        	 {
                sum = sum + marks[j];
        		
        		 
        	 }
         }
         System.out.println("total sum" + sum);
         
	}

}
