package Strog;

public class multithreadingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table x = new table();
		tablemulti ob1 = new tablemulti(x);
		tablemulti2 ob2 = new tablemulti2(x);
		ob1.start();
		ob2.start();
		

	}

}
