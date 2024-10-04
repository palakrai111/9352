package Strog;

public class Recursionexample {
	int i =1;
	void p()
	{
		while(i<=5)
		{
			System.out.println("hello");
			i++;
		//	p();
		}
		p();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursionexample ob = new Recursionexample();
		ob.p();
	}

}
