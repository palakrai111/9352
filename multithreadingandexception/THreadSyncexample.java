package Strog;

public class THreadSyncexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printingatable x = new Printingatable();
		FirstThread ob1 = new FirstThread(x);
		SecondThread ob2 = new SecondThread(x);
		ob1.start();
		ob2.start();

	}

}
