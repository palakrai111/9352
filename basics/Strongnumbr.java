package Strog;

public class Strongnumbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 135;
		int temp = 135;
		int sum = 0;
		
		while(num != 0)
		{
			int fact = 1;
			int d = num % 10;
			for(int j =d; j>=1;j--)
			{
				fact =fact * j;
			}
			sum = sum + fact;
			num = num/10;
		}
		
        if (sum == temp)
        {
        	System.out.println("Strong ");
        }
        else
        {
        	System.out.println("not strong");
        }
	}

}
