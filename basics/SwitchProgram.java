
public class SwitchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i = 4;
	/*	char c = 'A';
		String day = "Mon";
		switch(day)
		{
		case "Mon": System.out.println("char is a vowel");
		break;
		case "tue": System.out.println("char is ");
		break;
		default: System.out.println("invalid");
			
		}
        System.out.println("ouside switch");
       // for(initialization, condtion, inc/dec)*/
        /*for(int i = 10; i>=1;i--)
        {
        	System.out.println(i);
        }*/
        int sum = 0;
        for(int i = 1; i <= 5; i++)
        {
        	sum = sum + i;
        }
        
        System.out.println("sum is "+ sum);
        int num=5;
        for(int i = 1; i <= 10; i++)
        {
        	System.out.printf("%d*%d=%d\n", i,num,i*num);
        }
        
        int fact = 1;
        for(int k = 6; k >=1; k--)
        {
        	fact = fact * k;
        }
        System.out.println("factorial is"+fact);
        int seven =0;
        int sodd =0;
        int countereven =0;
        int counterodd =0;
        int sumeven = 0;
        int mulplicationodd = 1;
        
        for(int i = 1 ; i <=5; i++)
        {
        	if(i%2 == 0)
        	{
        		seven = seven + i;
        		countereven++;
        		sumeven = sumeven + i;
        	}
        	else
        	{
        		sodd = sodd + i;
        		counterodd++;
        		mulplicationodd = mulplicationodd * i;
        	}
        }
        
        System.out.println("sum even" + seven);
        System.out.println("sum odd" + sodd);
        System.out.println(countereven);
        System.out.println(counterodd);
        System.out.println("sum"+sumeven);
        System.out.println("product"+mulplicationodd);
        
        
        for(int i = 0; i< 5; i++)
        {
        	for(int j = 0; j< 5; j++)
        	{
        		System.out.println(i +" "+ j);
        	}
        	//System.out.println();
        }
        
	}
	
	

}
