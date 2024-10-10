package Strog;

public class Printingatable {

	synchronized public void print(int n)
	{
		for(int i = 1; i <=10;i++)
		{
		System.out.println(i*n);
		}
	}
	
}
