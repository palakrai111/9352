package Strog;

public class Overloadingex {
	
	void add(int a , int b)
	{
		System.out.println(a+b); 
		//return 0;
	}
	
	void add(String c, int d)
	{
		System.out.println(c+d); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloadingex ob = new Overloadingex();
		ob.add(5, 6);
		//ob.add("mm", "nn");

	}

}
