package varibles;
import java.util.Scanner;
public class Arraysexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int b[]= new int[3];  //array is created
		/*b[0] = 1;
		b[1] = 2;
		b[2] = 11;*/
		System.out.println("---enter array---");
		for(int i =0; i <b.length; i++)
		{
		b[i] = sc.nextInt();
		}
		
		System.out.println("---array---");
		for(int i =0; i <b.length; i++)
		{
			System.out.println(b[i]);
		}
		int max = b[0];
		int min = b[0];
		for(int i =0; i <b.length; i++)
		{
			/*if(b[i] > max)
			{
				max = b[i];
			}
			if(b[i] < min)
			{
				min = b[i];
			}*/
			
		}
		System.out.println("max is :" + max);
		System.out.println("min is :" + min);
		
		
		
		
		int sum =0;
		int a[] = {10,20,30};
		for(int i =0; i <a.length; i++)
		{
			sum = sum + a[i];
		}
        System.out.println("sum is :"+sum);
	}

}
