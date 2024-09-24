package Strog;

public class reverseofstringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = "";
		String s = "palak";
		
		for(int i = s.length()-1; i>= 0; i-- )
		{
			rev = rev + s.charAt(i);
		}
      System.out.println(rev);
		if(rev.equals(s))
		{System.out.println("palindrome");}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
