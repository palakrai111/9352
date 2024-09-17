package Strog;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		
		for(int i = 0; i <3;i++)
		{
			System.out.println("enter no");
			a[i] = sc.nextInt();
		}
		for(int i = 0; i <3;i++)
		{
			System.out.println(a[i]);
			
		}
		
		int sumeven = 0;
		int sumodd = 0;
		int counteven = 0;
		int cuntodd = 0;
		for(int i = 0; i <3;i++)
		{
			if(a[i]%2 == 0)
			{
			sumeven = sumeven + a[i];
			counteven++;
			}
			else
			{
				sumodd = sumodd+a[i];
				cuntodd++;
			}
		}
		 System.out.println("sumeven"+sumeven);
		 System.out.println("sumodd"+sumodd);
		 System.out.println("ceven"+counteven);
		 System.out.println("odd"+cuntodd);
		 
		 
		 int key = 12;
		 int flag = 0;
		 int i;
		 for(i = 0; i <3;i++)
			{
				if(a[i]== key)
				{
					//flag++;
					System.out.println("element fount at index" +i);
					break;
					
				}
				else
				{
					System.out.println("elemet not found");
				}
				
			}
	/*	if(flag >=1) 
		{
			System.out.println("element fount at index" +i);
		}
		else
		{
			System.out.println("elemet not found");
		}*/


	}

}
