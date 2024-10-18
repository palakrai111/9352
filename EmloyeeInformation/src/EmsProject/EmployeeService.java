package EmsProject;
import java.util.*;
public class EmployeeService 
{
	Scanner sc = new Scanner(System.in);
	ArrayList<EmployeeEntity> a1 = null;
	EmployeeService ()
	{
		a1 = new ArrayList<EmployeeEntity>();
	}
	
	void addEmployee()
	{
		System.out.println("enter id");
		int id  = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		EmployeeEntity ob = new EmployeeEntity(id,name,address);
		a1.add(ob);
		System.out.println("added successfully");
	}
	void display()
	{
		for(EmployeeEntity e1 : a1)
		{
			System.out.println(e1.id+ "--- "+ e1.name +"----"+ e1.address);
		}
	}
	void searcEmp(int eid)
	{
		boolean found = false;
		for(EmployeeEntity e1 : a1)
		{
			if(e1.id == eid)
			{
				System.out.println(e1.id + e1.name + e1.address);
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("employee found");
		}
		else
		{
			System.out.println("not found");
		}
	}
	
	void delete(int eid)
	{
		
		boolean found = false;
		for(EmployeeEntity e1 : a1)
		{
			if(e1.id == eid)
			{
				//System.out.println(e1.id + e1.name + e1.address);
				found = true;
				a1.remove(e1);
				break;
			}
		}
		if(found)
		{
			System.out.println("removed successfully");
			
		}
		else
		{
			System.out.println("not found");
		}
		
		
	}
	void update(int eid)
	{
		boolean found = false;
		for(EmployeeEntity e1 : a1)
		{
			if(e1.id == eid)
			{
				//System.out.println(e1.id + e1.name + e1.address);
				found = true;
				System.out.println("enetr name to be updated");
				String name = sc.next();
				System.out.println("enetr address to be updated");
				String address = sc.next();
				e1.setAddress(address);
				e1.setName(name);
			}
		}
		if(found)
		{
			System.out.println("updated successfully");
			
		}
		else
		{
			System.out.println("not found");
		}
	}
	
	
	
	
}