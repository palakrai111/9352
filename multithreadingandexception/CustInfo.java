package Strog;

public class CustInfo
{
	int amount=500;    
    
	synchronized void withdraw(int a){    
	System.out.println("going to withdraw...");    
	    
	if(this.amount<a)
	{    
	System.out.println("Less balance; waiting for deposit...");    
	try{
		wait();
	}catch(Exception e){}    
	}    
	this.amount-=a;    
	System.out.println("withdraw completed..." + amount);    //2000 deposit 1000 withdraw
	
	}    
	    
	synchronized void deposit(int a){    
	System.out.println("going to deposit...");    
	this.amount+=a;    
	System.out.println("deposit completed... " + amount);    
	notify();    
}
}