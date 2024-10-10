package Strog;

public class Exceptionexample {

	
	static void display()
	{
		System.out.println("hello");
		try {
		int a  = 10/0;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	static void show()
	{
		System.out.println("hii");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		System.out.println("hello122");
		show();
}}