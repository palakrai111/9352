package Strog;

public class Threadcust2 extends Thread
{
	CustInfo c2;
	Threadcust2(CustInfo c2)
	{
		this.c2 = c2;
	}
   public void run()
   {
	   c2.deposit(2000);
   }
}
