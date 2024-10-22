import java.util.Map;
import java.util.*;

public class StudentMap {
    int id;
    public StudentMap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	String name;
	
	
	
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



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMap ob1 = new StudentMap(101,"palak");
		StudentMap ob2 = new StudentMap(102,"nayan");
		StudentMap ob3 = new StudentMap(103,"gagan");
		Map<Integer,StudentMap> m = new TreeMap<Integer,StudentMap>();
		m.put(1, ob1);
		m.put(3, ob3);
		m.put(2, ob2);
		Set<Integer> s = new HashSet<Integer>();
		s = m.keySet();
		for(int i : s)
		{
			System.out.println(m.get(i).id + " "+ m.get(i).name);
		}
		for(Map.Entry<Integer,StudentMap> x : m.entrySet())
		{
			int i = x.getKey();
			System.out.println(x.getValue().id + " " + x.getValue().name + i);
		}
  
	}

}
