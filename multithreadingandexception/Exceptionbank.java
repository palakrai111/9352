package Strog;

public class Exceptionbank {

	int amount = 1000;
	void withdraw(int wamt) throws InsufficientBalanceException
	{
		if(wamt > amount)
		{
			throw new InsufficientBalanceException("insufficient amt in your account");
		}
		else
		{
			amount = amount - wamt;
			System.out.println("remaining balc is " + amount);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptionbank ob = new Exceptionbank();
		try
		{
			ob.withdraw(500);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
