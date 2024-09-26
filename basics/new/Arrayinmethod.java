package Strog;

public class Arrayinmethod {
   int sumofarray(int x[])
   {  int sum = 0;
	   for(int z:x)
	   {
		  sum = sum+z;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y[] = {1,2,3,4,5};
		Arrayinmethod ob = new Arrayinmethod();
		System.out.println(ob.sumofarray(y));
       
	}

}
