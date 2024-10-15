package Strog;
import java.io.*;
public class ObjectSerialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 FileOutputStream fon = null;
			try {
				  fon = new FileOutputStream("D:\\testout5.txt");
				  ObjectOutputStream oos = new ObjectOutputStream(fon);
				  Customer c = new Customer(10,"palak");
				 oos.writeObject(c);
				  System.out.println("success");
			}catch(Exception e)
			{
				System.out.println(e);
			}
            finally
			{  try {
				fon.close();
			   }catch(Exception e)
			{
				   System.out.println(e);
			}
			}

	}

}
