package mini_project;
import java.util.*;

public class Restaurant_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant_Owner owner=new Restaurant_Owner();
		Customer customer=new Customer();
		Scanner sc=new Scanner(System.in);
		boolean Want_To_Continue=true;
		while(Want_To_Continue) {
			System.out.println("\n------WELCOME TO RESTAURANT------\n");
			System.out.println("(Enter 1 for Owner and 2 for Customer"+ ") ");  
			System.out.println("1) Owner");
			System.out.println("2) Customer");
			
			byte loginAs=sc.nextByte();
			switch(loginAs) {
			case 1:
				System.out.println("------AUTHENTICATION-------");
				System.out.println("Enter username.");
				String uname = sc.next();
				sc.nextLine();
				System.out.println("Enter password.");
				String password = sc.next();
				if (owner.authorize(uname, password)) {
					Operations.OwnerOperations(owner);
				} else {
					System.out.println("Invalid credentials.");
				}
				break;
				
			case 2:
				Operations.CustomerOperations(customer);
				break;
				
			default:
				System.out.println("Invalid Choice!! " + "Terminating program.");
				Want_To_Continue = false;
			}
		}

	}

}
