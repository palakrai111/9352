package Strog;

class Animal123
{
	void eat()
	{
		System.out.println("animals");
	}
}
class dog extends Animal123
{
	void eat()
	{
		super.eat();
		System.out.println("dog is eating");
	}
}
class cat extends Animal123
{
	void eat()
	{
		System.out.println("cat is eating");
	}
}

public class overriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Animal123 ob;
      
      ob = new dog();
      ob.eat();
      
      ob = new cat();
      ob.eat();
	}

}
