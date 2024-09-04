package varibles;

public class greterindiit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 2341270;
        int max = 0;
        int min = 9;
        while(x!=0)
        {
            	int d = x%10;
            	/*if (d>max)
            	{
            		max = d;
            	}
            	x = x/10;*/
            	if (d<min)
            	{
            		min = d;
            	}
            	x = x/10;
            	
            	
        }
        //System.out.println(max);
        System.out.println(min);
        
	}

}
