import java.util.Scanner;
public class RedGreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter light");
		String light = sc.next();
		if(light.equals("Red"))
		{
			System.out.println("red signal");
		}
		else if(light.equals("Green"))
		{
			System.out.println("green signal");
		}
		else
		{
			System.out.println("invalid");

		

	}

}}
