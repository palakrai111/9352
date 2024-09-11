
public class reversenumber {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0;
		int temp;
		int num = 232;
		temp = num;
        while(num != 0)
        {
        	int d = num % 10;
        	rev = rev * 10 + d;   // sum = sum + d;
        	num = num /10;
        }
        if(temp == rev)
        {
        	System.out.println("equal");
        }
        else
        {
        	System.out.println("not equal");
        }
        for(int j = 1; j<=5;j++)
        {
        	{        	for(int k = 5; k>=1; k--)

        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        
        
	}

}
