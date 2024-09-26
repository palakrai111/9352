package Strog;

public class Constructorexample {
	int id;
	String name;
	int fees;
	/*Constructorexample()//default constructor
	{
		System.out.println("i am inside default constructor");
	}*/
	Constructorexample(int i,String n)//default constructor
	{
		System.out.println("i am inside parametrised constructor");
		id = i;
		name = n;
	}
	Constructorexample(int i,String n,int f)//default constructor
	{
		System.out.println("i am inside parametrised constructor");
		id = i;
		name = n;
		fees = f;
	}
	
	void display()
	{
		System.out.println(id + " "+name+ " "+fees);
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexample ob = new Constructorexample(101,"palak");
		ob.display();
		Constructorexample ob2 = new Constructorexample(102,"nayan",1000);
		ob2.display();
	}

}
