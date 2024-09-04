package varibles;

public class largestdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12345678;
		int max = 0;
		while(x!=0)
		{
			int d = x%10;
			if(d>max)
			{
				max = d;
			}
			x = x/10;
		}
      System.out.println(max);
	}

}
