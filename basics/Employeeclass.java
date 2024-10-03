package Strog;

public class Employeeclass {
	Addressclass a;
	int id;
	String name;
	Employeeclass(int id, String name,Addressclass a)
	{
		this.id = id;
		this.a = a;
		this.name = name;
	}
    void display()
    {
    	System.out.println(id + name + a.city + a.State);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addressclass ob1 = new Addressclass("viza","A.P");
		
		Employeeclass ob = new Employeeclass(1,"palak",ob1);
		ob.display();

	}

}
