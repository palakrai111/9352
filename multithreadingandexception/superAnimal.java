package Strog;

class Animal12345
{int x;
	Animal12345(int x)
	{
		this.x = x;
		System.out.println("parentclass constructor");
	}
	void eat()
	{
		System.out.println("Animal is eating" + x);
	}
}
class dog12345 extends Animal12345
{
	dog12345(int x)
	{
		super(x);
		System.out.println("i am child class constructor" );
	}
	String name = "nayan";
	void eat()
	{
		super.eat();
		System.out.println("dog is eating" + name + x);
	}


}
public class superAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal12345 ob  = new dog12345(5);
		ob.eat();
	}

}
//Runnable interface
// Thread class
// java.lang

