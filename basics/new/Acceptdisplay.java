package Strog;

import java.util.Scanner;

public class Acceptdisplay {
	int id;
	String name;
    void acceptInfo()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter id");
    	 id = sc.nextInt() ;
    	System.out.println("enter name");
    	 name = sc.next();
    }
    void displayInfo()
    {
    	System.out.println(id + " "+name);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acceptdisplay ob = new Acceptdisplay();
		ob.acceptInfo();
		ob.displayInfo();
		Acceptdisplay ob1 = new Acceptdisplay();
		ob1.acceptInfo();
		ob1.displayInfo();

	}

}
