package EmsProject;
import java.util.*;
public class Employeemain {

	static void menu()
	{
		 System.out.println("****************Welcome To Employee Managment System *********** "
	        		+ "\n1. Add Employee "
	        		+ "\n2.View Employee"
	        		+ "\n3.Update Employee"
	        		+ "\n4. Delete Employee"
	        		+ "\n5.View All Employee"
	        		+ "\n6. Exist ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService s1 = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		/*for(int i = 0; i<2; i++)
		{
		s1.addEmployee();
		}
		s1.display();
		
		s1.searcEmp(2);
		s1.delete(eid);
		//s1.display();
		s1.update(eid);
		s1.display();*/
		int eid = 2;
		boolean continued = true;
		
		  do {
			  menu();
			  int choice = sc.nextInt();
			  switch(choice)
			  {
			  case 1:
				  for(int i = 0; i<2; i++)
					{
					s1.addEmployee();
					}
				  break;
				  
			  case 2:s1.searcEmp(2);
				 
			  break;
			  case 3: 
				  s1.update(eid);
				  break;
			  case 4 : 
				  s1.delete(eid);
				  break;
			  case 5 :
				  s1.display();
				  break;
			  case 6 :
				  continued = false;
			  }
		  }while(continued);

	}

}
