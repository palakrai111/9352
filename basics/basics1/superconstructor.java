package Strog;

class sum1
{
	int id;
	sum1(int id)
	{
		this.id = id;
	}
}
class sum2 extends sum1
{
	//int id;
	String name;
	sum2(int id , String name)
	{
		super(id);
		this.name = name;
	}
	void display()
	{
		System.out.println(id + " "+ name);
	}
	
}


public class superconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    sum2 ob = new sum2(1,"abc");
    ob.display();
	}

}
