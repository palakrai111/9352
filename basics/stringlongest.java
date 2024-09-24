package Strog;

public class stringlongest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "i am the longest nnn";
         int res =0;
         int cur_length = 0;
         for(int i = 0; i < s.length(); i++)
         {
        	if(s.charAt(i) != ' ') 
        	{
        		cur_length++;
        	} 
        	else
        	{
        		res =Math.max(cur_length, res);
        		cur_length = 0;
        	}
         }
        		 
		System.out.println(Math.max(res, cur_length));
		//System.out.println(cur_length);
		
		
	}

}
