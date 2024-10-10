package Strog;

public class Threadcust1 extends Thread
{
	CustInfo c1;
	Threadcust1(CustInfo c1)
	{
		this.c1 = c1;
	}
   public void run()
   {
	   c1.withdraw(1000);   
   }
}
