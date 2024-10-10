package Strog;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//int a[] = new int[3];
		//a[3] = 10/5;
		String s = null;
		System.out.println(s.length());
		}
		
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
        catch(ArithmeticException e)
		{
        	System.out.println(e);
		}*/
		
	    finally
	    {
	    	System.out.println("i will be excuted always");
	    }
		System.out.println("hello everyone");
	}

}
