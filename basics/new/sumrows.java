package Strog;

public class sumrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i< 3; i++)
		{
			int sumrow = 0;
			int sumcol = 0;
			for(int j = 0; j< 3; j++)
			{
				sumrow = sumrow + c[i][j];
				sumcol = sumcol + c[j][i];
				
			}
			System.out.println("rowwise sum"+ " "+sumrow);
			System.out.println("colwise sum"+ " "+sumcol);
		}

	}

}
