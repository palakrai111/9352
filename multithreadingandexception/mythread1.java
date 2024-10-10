package Strog;

public class mythread1 implements Runnable
{
	public void run()
	{for(int i =0;i < 10; i++)
	{
		System.out.println(i+" "+Thread.currentThread().getName()+ " "+Thread.currentThread().getPriority());
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread1 m1 = new mythread1();
		Thread t1 = new Thread(m1);
		t1.start();
		
		mythread1 m2 = new mythread1();
		Thread t2 = new Thread(m1);
		t2.start();
		

	}

}
//new
// start() //ready to run
// run // running
//dead
