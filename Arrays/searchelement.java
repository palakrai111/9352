package varibles;

public class searchelement {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		int key =2;
		int i;
		int b[]= new int[3];  //array is created
		b[0] = 1;
		b[1] = 2;
		b[2] = 11;
		System.out.println("---enter array---");
		for(i =0; i <b.length; i++)
		{
		    if(b[i] == key)
		    {
		    	flag = 1;
		    	break;
		    }
		}
		
		if (flag == 1)
		{
			System.out.println("element found" + i);
		}
		else {System.out.println("nt found");}
		

	}

}
