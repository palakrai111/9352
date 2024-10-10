package Strog;

public class tablemulti extends Thread
{
	table t1;
	tablemulti(table t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		t1.print(7);
	}
       
}
