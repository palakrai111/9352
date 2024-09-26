package Strog;

public class StringBufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "abc";
		int i = 10;
		System.out.println(10 + i);//20
		System.out.println(10 + String.valueOf(i)); //1010
		int y = x.indexOf('b');
		System.out.println(y);
		
		String l ="abc";
		String z = String.join(" ",l,"df");
		System.out.println(z);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("palak");
		sb.append('c');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println("delete"+sb);
		sb.insert(1, "abcvvv");
		System.out.println("insert"+sb);
		sb.replace(0, 3,"*");
		System.out.println("replace"+sb);
		sb.
	    

	}

}
