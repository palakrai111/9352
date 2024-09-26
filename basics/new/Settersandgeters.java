package Strog;

public class Settersandgeters {

	 String name;
	    int age;
	    
	    void setName(String n) 
	    {
	    	name = n;
	    }
	    String getNam()
	    {
	    	return name;
	    }
	    void setAge(int a) 
	    {
	         age= a;
	    }
	    int getAge()
	    {
	    	return age;
	    }
	    
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Settersandgeters ob = new Settersandgeters();
		ob.setName("palak");
		ob.setAge(30);
		Settersandgeters ob2 = new Settersandgeters();
		ob2.setName("pal");
		ob2.setAge(20);
		Settersandgeters ob3 = new Settersandgeters();
		ob3.setName("pk");
		ob3.setAge(10);
		System.out.println(ob.getAge()+ " "+ob.getNam());
		System.out.println(ob2.getAge()+ " "+ob2.getNam());
		System.out.println(ob3.getAge()+ " "+ob3.getNam());
	}

}
