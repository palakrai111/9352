package Strog;

public class ThreadRunnableexample implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <= 10;i++)
		{
			System.out.println(i+ Thread.currentThread().getName());
			try
			{
			Thread.sleep(3000);
			}catch(Exception e)
			{System.out.println(e.getMessage());}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnableexample t1 = new ThreadRunnableexample();
		Thread ob1 = new Thread(t1);
		//t1.run();
		ob1.start();
		//ob1.start();
		ob1.setName("first");
		ob1.setPriority(10);
		ThreadRunnableexample t2 = new ThreadRunnableexample();
		Thread ob2 = new Thread(t2);
		ob2.start();
		ob2.setName("second");
		ob2.setPriority(1);
		//t2.run();
		
		

	}

	

}
