package Strog;

public class tablemulti2 extends Thread
{
	table t2;
	tablemulti2(table t2)
	{
		this.t2 = t2;
	}
	public void run()
	{
		t2.print(5);
	}
       
}
