package varibles;
import java.util.Arrays;
public class Arraysmethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {3,1,2,4};
        int b[] = {3,1,2,4};
      int i =  Arrays.binarySearch(a,4);
      System.out.println(i);
     // Arrays.sort(a);
      
      System.out.println(a); //aray (object)
      for(int j=0; j<a.length;j++)
      {
    	  System.out.println(a[j]);
      }
       boolean b1 = Arrays.equals(a,b);
       System.out.println("equality"+b1);
       
       int ch = 65;
       System.out.println((char)ch);
       
       
       
          int arr3[] = {1,1,3,3,3,1,2};
          int count = 0;
          for(int k = 0; k<arr3.length;k++)
          {
        	  for(int l = k+1; l<arr3.length;l++)
        	  {
        		  if(arr3[k]== arr3[l])
        		  {
        			  count ++;
        			  break;
        		  }
        	  }
          }
       
	}

}
