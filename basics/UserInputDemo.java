import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         System.out.println("enter age");
         int age = sc.nextInt();
         System.out.println("age is"+age);
         
         System.out.println("enter name");
         String name = sc.next();
         System.out.println("name is" + name);
         
         System.out.println("eneter gender");
         char c = sc.next().charAt(0);
         System.out.println(c);
         System.out.println("eneter salary");
         float salary = sc.nextFloat();
         System.out.println(salary);
         
         
         
	}

}
