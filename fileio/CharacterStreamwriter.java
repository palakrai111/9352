package Strog;
import java.io.*;

public class CharacterStreamwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileWriter fw = null;
		try {
			  fw = new FileWriter("D:\\testout2.txt");
			   
			  String s = "Welome to java application ..... palak rai..... hello world";
			 
			  fw.write(s);
			  System.out.println("done successfully");
			 
					}catch(Exception e)
					{
						System.out.println(e);
					}
		            finally
					{  try {
						fw.close();
					   }catch(Exception e)
					{
						   System.out.println(e);
					}
					}

	}

}
