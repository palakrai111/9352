
public class Armstringno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalnum = 151;
		int num = 151;
		int temp = 151;
		int count =0;
		double sum = 0;
		while(num != 0)
		{
			int d= num % 10;
			
			count ++;
			num = num / 10;
		}
		while(temp != 0)
		{
			int d= temp % 10;
			sum = sum+Math.pow(d,count);
			
			temp = temp / 10;
		}
		
       if(originalnum == sum)
       {System.out.println("armstrong");}
       else {System.out.println(" notarmstrong");}
	}

}
