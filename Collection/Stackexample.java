import java.util.*;
public class Stackexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stack s = new Stack();
		s.push(1);  // lifo 
		s.push(10);
		s.push(15);
		s.push(18);
		System.out.println("tomost value"+s.peek());
		s.pop();
		s.pop();
		System.out.println(s);
		
		Vector<Integer> v = new Vector();
		v.addElement(1); 
		v.addElement(2); 
		v.addElement(3);
		v.addElement(4);
		System.out.println(v); // [1 2  3 4]
		System.out.println(v.size());//4
		System.out.println(v.contains(5)); //false
		System.out.println(v.isEmpty()); //false
		System.out.println(v.indexOf(3)); //2
		System.out.println("_______________");*/
		
		Set s1 = new HashSet();
		s1.add("A");
		s1.add("C");
		s1.add("B");
		s1.add("D");
		s1.add("D");
		System.out.println(s1);
		
		Set s2 = new LinkedHashSet();
		s2.add("A");
		s2.add("C");
		s2.add("B");
		s2.add("D");
		s2.add("D");
		System.out.println(s2);
		
		Set<Integer> s3 = new TreeSet();
		s3.add(17);
		s3.add(2);
		s3.add(10);
		s3.add(19);
		s3.add(19);
		
		System.out.println(s3);
		for(int i : s3)
		{
			System.out.println(i);
		}

	}

}
