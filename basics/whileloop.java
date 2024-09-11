
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i = 0;
       int j = 10;
       int sum = 0;
       while(i<=10)
       {
    	  if(i%2 == 0)
    	  {
    		  sum = sum +i;
    	  }
    	  i++;
       }
       System.out.println("sum"+sum);
       while(j>=1)
       {
    	   System.out.println(j);
    	   j--;
       }
	}

}
