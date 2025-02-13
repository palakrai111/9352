package in.sp.crmproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.crmproject.dao.EmployeeDao;
import in.sp.crmproject.entity.Employee;
@Service
public class EmpSerimpl implements EMPService
{
    @Autowired
    EmployeeDao ed;
    
	@Override
	public boolean addEmployeeService(Employee emp) {
		// TODO Auto-generated method stub
		boolean status = false;
		try
		{
			ed.save(emp);
			status = true;
		}catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		List<Employee> l = ed.findAll();
		return l;
	}

	@Override
	public boolean deleteEmp(String email) {
		boolean status = false;
		try
		{
			ed.deleteByEmail(email);
			status = true;
		}catch(Exception e)
		{
			e.printStackTrace();
			status = false;
		}
		return status;
	}

	@Override
	public Employee findEmpBYEmail(String email) {
		// TODO Auto-generated method stub
		Employee e = ed.findByEmail(email);
		return e;
	}

	@Override
	public boolean updateEmp(Employee emp) {
		boolean status = false;
		try {
		Employee existingemp = ed.findByEmail(emp.getEmail());
		if(existingemp != null)
		{
			
			existingemp.setName(emp.getName());
			existingemp.setPassword(emp.getPassword());
			existingemp.setEmail(emp.getEmail());
			existingemp.setPhoneno(emp.getPhoneno());
			ed.save(existingemp);
			status = true;
			
		}
		}catch(Exception e)
		{
			e.printStackTrace();
			status = false;
		}
		
		return status;
	}

}
