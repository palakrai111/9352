package Strog;

public class SecondThread extends Thread
{
	Printingatable p2;
	SecondThread(Printingatable p2)
	{
		this.p2 = p2;
	}
	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		p2.print(5);
	}
}
