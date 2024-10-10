package Strog;

public class EXceptionusingthreadclass extends Thread
{
	/*public void print(int n)
	{
		for(int i = 1; i <= 10;i++)
		  {
			  System.out.println(i*n);
		  }
		
	}*/
  public	void run()
  {
	  //print(5);
	  for(int i = 0 ; i <= 5;i++)
	  {
		  System.out.println(Thread.currentThread().getName() + i);
		  try {
			  Thread.sleep(3000);
			 // Thread.sleep(-3000); //InterruptedException checkedexception, we cant use t1.start twice
			  // we cannot pass negative value inside sleep method bcoz it will return illegar arguments
			  // we can  not use t1.start twice
			  // we cannot directly invoke run method it will be treated same as object calling a method
		  }catch(Exception e) {System.out.println(e);}
	  }
	 
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EXceptionusingthreadclass t1 = new EXceptionusingthreadclass();
		t1.start();
		EXceptionusingthreadclass t2 = new EXceptionusingthreadclass();
		t2.start();
	}

}
