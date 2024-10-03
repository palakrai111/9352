package Strog;


abstract class absex1
{
	absex1()
	{
		System.out.println("i am constructor");
	}
	abstract void show(int x);
	void display()
	{
		System.out.println("hello world");
	}

}
public class absexample1 extends absex1
{
	void show(int x) {
		// TODO Auto-generated method stub
		System.out.println(x*x*x);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		absex1 ob = new absexample1();
		ob.show(5);
		ob.display();
		
	}

	

}
