package Strog;

import java.util.*;
public class userinputdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1;
        do
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enetr userid");
        	String uid = sc.next();
        	
        	System.out.println("enetr age");
        	int age = sc.nextInt();
        	System.out.println("enetr password");
        	String pwd = sc.next();
        	System.out.println("if you wnt to continue press yes('y') else press no('n')");
        	ch1 = sc.next().charAt(0);
        	if(ch1 == 'n')
        	{
        		break;
        	}
        	
        }
		while(ch1 == 'y');
		
		
	}

}
