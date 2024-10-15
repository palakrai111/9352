package Strog;
import java.io.*;

public class BufferReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enetr name");
			String name = br.readLine();
		
			System.out.println("Enetr age");
			int age =  Integer.parseInt(br.readLine());
			System.out.println("name is :"+name + " "+ "age is :" +age);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
