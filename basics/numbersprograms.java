
public class numbersprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swap
		int a = 20;
		int b = 10;
		int c ;
		c = a;
		a = b;
		b = c;
		//System.out.println("a"+ a + " "+ "b"+b);
		//fibonacii
		int n1 = 5;
		int n2 = 6;
		//System.out.print(n1+ " "+ n2);
		/*for(int i =2 ; i <5; i++)
		{
			int n3 = n1+n2; // 1
			n1 = n2;  // 1
			n2 = n3;//2
			System.out.print(" "+n3+" ");
			
		}
		*/
		// reverse
		int originalnum = 158;
		int num = 158;
		int rev = 0;
		int sum = 0;
		int count =0;
		while(num != 0)
		{
			int d= num % 10;
			rev = rev * 10 + d;
			sum = sum + d;
			count ++;
			num = num / 10;
		}
		System.out.println("rev"+rev);
		System.out.println("sum"+sum);
		System.out.println("count"+count);
		
		if (originalnum == rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
        
	}

}
