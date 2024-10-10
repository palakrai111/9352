package Strog;

public class Exceptiondemo {
	
	static void demo(int no) throws CustomEx
	{
		if(no < 0)
		{
			throw new CustomEx("notvalid");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
		demo(-1);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
