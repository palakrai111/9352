package Strog;

public class lowertriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][] = {{1,2,3},{4,5,6},{7,8,9}};
		// lowr tangular matrix
		for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j< 3; j++)
			{
				if(i>j)
				{
				System.out.print(" "+"0" + " " );
				}
				else 
				{
					System.out.print(" "+c[i][j]+ " ");
				}
			}
			System.out.println();
		}
	}

}
