import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashmapex {
	int id ;
	public hashmapex(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer,String> h1 = new HashMap();
		Map<Integer,hashmapex> h1 = new TreeMap<Integer,hashmapex>();
		/*h1.put(1,"palak");
		h1.put(2,"palak");
		h1.put(3,"palak");
		h1.put(4,"palak");*/
		Set<Integer> s = new HashSet<Integer>();
		s = h1.keySet();
		System.out.println(h1.values());
		/*for(int i : s)
		{
			System.out.println(h1.get(i)+i);
			
		}
          for( Map.Entry<Integer,String> m :h1.entrySet())
          {
           System.out.println(m.getValue() + m.getKey());
	}*/
		hashmapex ob1 = new hashmapex(3,"palak");
		hashmapex ob2 = new hashmapex(1,"nayan");
		hashmapex ob3 = new hashmapex(2,"n");
		
		h1.put(3, ob1);
		h1.put(1, ob2);
		h1.put(2, ob3);
		for( Map.Entry<Integer,hashmapex> m :h1.entrySet())
        {
			int i = m.getKey();
         System.out.println( i+ " "+m.getValue().id + ""+m.getValue().name);
	}

}
	
	
	
}