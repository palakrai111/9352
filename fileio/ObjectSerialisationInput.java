package Strog;
import java.io.*;
public class ObjectSerialisationInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 FileInputStream fin = null;
			try {
				  fin = new FileInputStream("D:\\testout5.txt");
				  ObjectInputStream ois = new ObjectInputStream(fin);
				    // Object  b = ois.readObject();
				  		Customer c = (Customer)ois.readObject();
				  		System.out.println(c.id + " "+ c.name);
				  System.out.println("success");
			}catch(Exception e)
			{
				System.out.println(e);
			}
            finally
			{  try {
				fin.close();
			   }catch(Exception e)
			{
				   System.out.println(e);
			}
			}

	}

}
