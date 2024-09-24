package Strog;

public class Strigeample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "Palak"; // 65
       String s2 = "palak";  // 97
       String s3 = new String("palak");
       if(s1.equals(s3))
       {
    	   System.out.println("equal");
       }
       else
       {
    	   System.out.println("not equal");
       }
           
       System.out.println(s1.compareTo(s2)); 
       
       
       String  x = "this is first program";
       
       String y[]= x.split(" ");
       for(String h :y)
       {
    	   System.out.println(h);
    	   String j = h.replace('i', 'p');
    	   System.out.println(j);
       }
       
                                               // 65 - 90
                                                // 97 - 122
	}

}
