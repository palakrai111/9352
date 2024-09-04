package varibles;

public class sumofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int no =5;
		for(int i = 0; i<a.length;i++)
		{
			for(int j = i+1; j<a.length;j++)
			{
				if(a[i]+a[j] == no)
				{
					System.out.println(a[i] + " "+a[j]);
				}
			}
		}

	}

}
