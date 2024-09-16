package Strog;

import java.util.Random;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Random r = new Random();
		int a[] = {11,42,13,44,55,67};  //{0 ,1 ,2 ,3, 4}
		for(int i = 0; i<5;i++)  // i = 0; i <= 5
				                        //    i = {0,1,2,3,4}
		{
			/*System.out.println(a[i]);
			System.out.println("length + index"+" " );
			System.out.println(a.length + i);
			System.out.println("first"+a[0]);
			System.out.println("last"+a[a.length - 1]);
			
			int mid = (0+4)/2; // 2      
			System.out.println(a[mid]);*/
			
			
			/*if(a[i]%2 == 0)
			{
				System.out.println("no is even"+a[i]);
			}
			else
			{
				System.out.println("no is odd"+a[i]);
			}*/
			
			System.out.println((int)Math.random());
			
			int x = r.nextInt(50);
			System.out.println(x);
			
		}
		
		
	}

}
