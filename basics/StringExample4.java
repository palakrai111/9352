package Strog;

public class StringExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "palak";
		System.out.println(s.concat("rai"));
		
		String x = "this is my accademy where i ome daily fr java class";
		int ccount= 0;
		int scount= 0;
		
		for(int i = 0; i < x.length();i++)
		{
		   char c =  x.charAt(i);
			if(c != ' ')
			{ccount++;}
			else {scount++;}
		}
		
		String y[] = x.split(" ");
		System.out.println("n of words"+y.length);
          System.out.println(ccount);
          System.out.println(scount);
	}

}
