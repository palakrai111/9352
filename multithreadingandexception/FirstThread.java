package Strog;

public class FirstThread extends Thread
{
	Printingatable p1;
	FirstThread(Printingatable p1)
	{
		this.p1 = p1;
	}
	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		p1.print(7);
	}
}
