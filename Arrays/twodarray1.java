package varibles;
import java.util.Scanner;
public class twodarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		System.out.println("elements");
		for(int i =0; i<2; i++)
		{
			for(int j =0; j<2; j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i =0; i<2; i++)
		{
			for(int j =0; j<2; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
    
	}

}
