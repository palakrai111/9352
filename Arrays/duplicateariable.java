package varibles;

public class duplicateariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5,6,1,5};
		/*for(int i = 0; i<a.length;i++)
		{
			for(int j = i+i; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			
			}
		}*/
		int i ;
		int temp = a[0];
		for( i = 0; i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[i]=temp;
		System.out.println("after rotation");
		for(int x :a)
		{
			System.out.print(x);
		}

	}

}
