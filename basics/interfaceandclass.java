package Strog;

public class interfaceandclass implements interface1,interface2
{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hello wrld");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceandclass ob = new interfaceandclass();
		ob.print();
		ob.show();
	}

	
	

}
