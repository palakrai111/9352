package in.sp.crmproject.service;

import java.util.List;

import in.sp.crmproject.entity.Employee;

public interface EMPService 
{
	public boolean addEmployeeService(Employee emp);
	public List<Employee> getEmployeeList();
	public boolean deleteEmp(String email);
	public Employee findEmpBYEmail(String email);
	public boolean updateEmp(Employee emp);
}
