package Strog;
class A
{
	void display(int x)
	{
		System.out.println("hello"+x+x);
	}
	
}
class B extends A
{
	void display(int x)
	{
		System.out.println("hii"+x*x);
	}
}
class c extends A
{
	void display(int x)
	{
		System.out.println("hii"+x*x*x);
	}
}
public class polyex 
{
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob = new c();
		ob.display(5);
		System.out.println(ob instanceof A);
	}

}
// final keyword, overoading, overriding,recursion,instanceof