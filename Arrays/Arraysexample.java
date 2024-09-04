package varibles;

public class Arraysexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,2,3,9};
		System.out.println(a.length);
		int max = a[0];
		int min = a[0];
		int key = 11;
		int flag = 0;
		for(int i =0;i<a.length;i++)
		{
			
			if (a[i]== key)
			{
				flag = 1;
				break;
			}
			/*if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}*/
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		if(flag == 1)
		{
			System.out.println("found");
		}
		else 
		{
			System.out.println("not found");
		}
	}

}
