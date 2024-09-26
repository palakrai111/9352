package Strog;

public class Animal {
     String name;
    int age;
    static String zoo = "zoovizag";
    int x = 10;
    void eat()
    {
    	
    	
		System.out.println("Animal is eating" + x);
    }
    
    void run()
    {
    	System.out.println("Animal is running" + x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal horse = new Animal();
		horse.name = "yz";
		horse.age = 35;
		System.out.println(horse.name + horse.age + zoo);
		horse.eat();
		Animal dog = new Animal();
		dog.name = "abc";
		dog.age = 35;
		System.out.println(dog.name + dog.age + zoo);
		dog.eat();

	}

}
//default
//para,etrinsed