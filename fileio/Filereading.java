package Strog;
import java.io.*;

public class Filereading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
   FileInputStream fin = new FileInputStream("D:\\testout.txt");
   int i =0;
   while((i=fin.read())!= -1)
   {
	   System.out.print((char)i);
   }
   fin.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
   
	}

}
