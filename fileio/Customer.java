package Strog;

import java.io.Serializable;

public class Customer implements Serializable
{
	int id ;
	String name;

	public Customer(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
}
