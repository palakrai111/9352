package Strog;

public class interfaceprintclass implements InterfacePrint
{@Override
	public void print() {
	// TODO Auto-generated method stub
	
	System.out.println("hello"+ x);
	
}

@Override
public void show() {
	// TODO Auto-generated method stub
	System.out.println("hii");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfacePrint ob = new interfaceprintclass();
		ob.show();
		ob.print();

	}

	

}
