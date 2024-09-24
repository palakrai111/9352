package Strog;

public class transposeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int d[][] = {{1,2,5},{4,5,7},{7,8,9}};
		int result[][] = new int[3][3];
		/*for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j< 3; j++)
			{
				System.out.print(c[j][i]);
			}
			System.out.println();
		}*/
		
		/*for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j< 3; j++)
			{
				result[i][j] = c[i][j] + d[i][j];
			}
			
		}
		
		for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j< 3; j++)
			{
				System.out.print(result[i][j]);
			}
			System.out.println();
		}*/
		
		
		boolean flag = true;
		
		for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j< 3; j++)
			{
				if ( c[i][j] != d[i][j])
				{
					flag = false;
					break;
				}
				
				
				
		}
			
			
		}
		if(flag)
		{System.out.println("equal");
			}
		else
		{
			System.out.println("not equal");
		}
		
		
		
		
		
		

	}

}
