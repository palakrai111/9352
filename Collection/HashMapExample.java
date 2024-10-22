import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> m = new TreeMap<String,String>();
		m.put("a","palak");
		m.put("c", "nayan");
		m.put("d", "raja");
		m.put("b", "Rani");
		//m.put("e",);
		System.out.println(m);
	/*	System.out.println(m.keySet()); // [1,2,3,4]
		System.out.println(m.values());
		System.out.println("value of 2 id"+m.get(2));
		Set<Integer> s = new HashSet<Integer>();
		s = m.keySet();  // returning set of key values that are in the form of int
		
	/*	for (int i : s)
		{
			System.out.println("value is"+" "+m.get(i) + ""+ " key is"+i);
		}*/
		
		
   /*  for(Map.Entry<Integer,String> n : m.entrySet())
     {
    	 System.out.println("value is"+" "+n.getValue() +  " "+" key is"+n.getKey());
     }*/
	System.out.println(m.getOrDefault("e","f"));//m.getOrDefault(, "abcd");
	m.replace("a", "palak", "xyz");
	System.out.println(m);
	System.out.println(m.keySet());
	
	}

}
