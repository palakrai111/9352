package Strog;

public class Throwexample {
	
	void validateAge(int age) throws ArithmeticException
	{
		if(age <18)
		{
			throw new ArithmeticException("age not valid");
		}
		System.out.println("helo");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Throwexample ob = new Throwexample();
		try {
		ob.validateAge(15);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("done");
	}

}
