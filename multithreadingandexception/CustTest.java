package Strog;

public class CustTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustInfo x = new CustInfo();
		Threadcust1 ob1 = new Threadcust1(x);
		Threadcust2 ob2 = new Threadcust2(x);
		ob1.start();
		ob2.start();
		

	}

}
