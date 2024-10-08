package Strog;
class Customer
{
	void get()
	{
		System.out.println("hello");
	}
	void Shopping()
	{
		System.out.println("Customer is shoping");
	}
	}
class RegularCustomer extends Customer
{
	void Shopping()
	{
		super.Shopping();
		System.out.println("RegularCustomer is shoping");
	}

}
class IrregularCustomer extends Customer
{
	void Shopping()
	{super.Shopping();
		System.out.println("IrregularCustomer is shoping");
	}

}


public class overridingexample 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ob = new IrregularCustomer();
		ob.get();
		Customer ob1 = new  RegularCustomer();
		ob1.get();
		ob.Shopping();
		ob1.Shopping();

	}

}
