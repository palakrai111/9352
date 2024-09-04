package varibles;

public class uniqueelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,23,10,22,11,44,1,11,43};
		int i,j;
		System.out.println("UNIQUE ELEMENTS ARE:");
		for(i=0;i<a.length;i++)
		{
		int temp=0;
		for(j=0;j<a.length;j++)
		{
		if((a[i]==a[j])&&(i!=j))
		{
		temp++;break;
		}
		}
		if(temp==0)
		{
			System.out.println(a[i]);
		}
		
		
		
		}
		
	}

}
