package Strog;

public class overloadingexample {
	
	
	static int addition(int a, int b)
	{System.out.println(a+b);
	return 0;
	}
	
	static String addition(String a, String b)
	{
		System.out.println(a+b);
        return a+b;
}

	public static void main(int x)
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition(5,6);
		addition("palak","rai");
		main(3);

	}

}
