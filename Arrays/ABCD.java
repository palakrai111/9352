package varibles;
import java.util.Scanner;
class ABCD {
public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array");
		int n=sc.nextInt();
		int [] arr= new int[n];
		System.out.print("enter array elements ");
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
		for (int j=i; j<arr.length; j++)
		{
		if((arr[i]+arr[j])== n && i!=j)  // 
		{
		System.out.println(arr[i]+","+arr[j]);
		}
		}
		}
		}
		

	}


