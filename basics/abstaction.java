package Strog;
abstract class absexample
{int y =10;
	absexample(int x)
	{
		System.out.println("deep"+ x);
	}
	abstract void display();
    void show() 
    {
    	System.out.println("hello");
    }
	   	


}
public class abstaction extends  absexample1
{ int y = 60;
	abstaction(int x)
	{
		super(x);
	}
    void display()
    {
    	System.out.println("abc" + y);
    }
   
	   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abstaction ob = new abstaction(5);
		ob.show();
		ob.display();
		
		

	}

}
