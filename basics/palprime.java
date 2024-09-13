
public class palprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num = 222;
		int temp = 222;
		int c = 0;
		int rev = 0;
		for (int i =1 ; i <= 222; i++)
		{
			if(num % i == 0) 
			{
				c++;
			}
			
		}
           if (c==2)
            {
            	System.out.println("prime number");
            }
            else
            {
            	System.out.println("not a prime nuber");
            }
            while(num != 0)
            {
            	int d = num % 10;
            	rev = rev * 10 + d;   // sum = sum + d;
            	num = num /10;
            }
            System.out.println(rev);
           if(temp == rev && c == 2)
            {
            	System.out.println("pal prime number");
            }
            else
            {
            	System.out.println("not pal prime");
            }
            
            
            
            
	}

}
