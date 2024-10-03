package Strog;
class s1
{
	int x = 10;
	void show()
	{
		System.out.println("i am parent class method");
	}
}
class s2 extends s1
{
	
	void show()
	{ super.show();
		int x = 20;
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class superexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s2 ob = new s2();
		ob.show();

	}

}
