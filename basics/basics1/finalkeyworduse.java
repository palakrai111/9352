package Strog;
 class Bike
{
	 final int x = 130;
	void run()
	{
		
		System.out.println("bike is running" + x);
	}
}
class Splendor extends Bike
{
	void run()
	{
		System.out.println("Splendor is running");
	}

}
public class finalkeyworduse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Splendor b = new Splendor();
	b.run();
	Animal123 ob = new Animal123();
	System.out.println( b instanceof Splendor);

	}

}
