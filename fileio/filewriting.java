package Strog;
import java.io.*;

public class filewriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileOutputStream fon = null;
		try {
			  fon = new FileOutputStream("D:\\testout1.txt");
			   
			  String s = "Welome to java application ..... palak";
			  byte b[]= s.getBytes();
			  fon.write(b);
			  System.out.println("done successfully");
			 
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
