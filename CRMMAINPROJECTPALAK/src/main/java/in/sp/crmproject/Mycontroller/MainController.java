package in.sp.crmproject.Mycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


import in.sp.crmproject.entity.Employee;
import in.sp.crmproject.service.EMPService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class MainController
{
	@GetMapping("/")
    public String indexPage()
    {
    	return "index";
    }
	@GetMapping("/index")
    public String index1Page()
    {
    	return "index";
    }
	@GetMapping("/login")
    public String loginPage()
    {
    	return "login";
    }
	@GetMapping("/profile-admin")
    public String profileadminPage()
    {
    	return "profile-admin";
    }
	@GetMapping("/add-employee")
	public String addemployeePage()
    {
    	return "add-employee";
    }
	@Autowired
	EMPService empService;
	
	@PostMapping("/addEmpForm")
	public ModelAndView registerEmp(@ModelAttribute Employee emp) {
		ModelAndView mv = new ModelAndView();
		
		
		
		boolean b = empService.addEmployeeService(emp);
		
		if(b) 
		{
			mv.addObject("status", emp.getName()+" Successfully added as emp");
			mv.setViewName("add-employee");
		}
		else {
			mv.addObject("error", emp.getName()+" Failed to add as ADMIN");
			mv.setViewName("add-employee");
	
		}
		emp.setName("");
		emp.setEmail("");
		emp.setPassword("");
		emp.setPhoneno("");
		return mv;
	}
	
	
	
	@PostMapping("/editEmpForm")
	public String editEmp(@ModelAttribute Employee emp,Model model) {
		
		   // String page = "edit-employee";
		boolean b = empService.updateEmp(emp);
		if(b)
		{
			model.addAttribute("status", "Employee updated successfully");
			//page = "employees-list";
		}
		else
		{
			model.addAttribute("error", "Employee not updated due to some error");
			//page = "employees-list";
		}
       return "edit-employee";
	}
	
	
	
	
	
	
	
	
	
	/*@PostMapping("/addEmpForm")
	public String employeeRegister(@RequestParam("name") String name1,
			@RequestParam("email") String email1,
			@RequestParam("password") String pass1,
			@RequestParam("phoneno") String pn,
			Model model
			
			)
	{
		String page = "add-employee";
		Employee e = new Employee();
		e.setName(name1);
		e.setEmail(email1);
		e.setPassword(pass1);
		e.setPhoneno(pn);
		//System.out.println(name1 + email1 + pass1 + pn);
		boolean b = empService.addEmployeeService(e);
		if(b)
		{
			
			model.addAttribute("status", "emplyee added succesfully");
		}
		else
		{
			 model.addAttribute("error", "not added");
		}
		e.setName("");
		e.setEmail("");
		e.setPassword("");
		e.setPhoneno("");
		
		return page;
		
	}*/
	
	@GetMapping("/employees-list")
	public String getmployeeList(Model model,
			@RequestParam(name = "r_status", required = false) String success,
			@RequestParam(name = "r_error", required = false) String error
)
	{
	List<Employee> emplist = empService.getEmployeeList();
		model.addAttribute("model_emp_list", emplist);
		model.addAttribute("status", success);
		model.addAttribute("error", error);

		return "employees-list";
	}
    @GetMapping("/updateEmp/{emailid}")
	public String updateE(@PathVariable String emailid,Model model)
	{
	  //System.out.println(e);
		Employee e = empService.findEmpBYEmail(emailid);
		model.addAttribute("editemp", e);
		return "edit-employee";
	}
	@GetMapping("/deleteEmp/{emailid}")
	public String dE(@PathVariable String emailid,Model model,RedirectAttributes redirectAttributes)
	{
	  System.out.println(emailid);
		boolean b = empService.deleteEmp(emailid);
	    if(b)
	    {
	    	redirectAttributes.addAttribute("r_status", "emplyee deleted succesfully");
	    }else
	    {
	    	redirectAttributes.addAttribute("r_error", "not deleted");
	    }
		return "redirect:/employees-list";
	}//redirect:/emplist
	
	
	
	
	
	@PostMapping("/loginform")
	public String loginadmin(
			@RequestParam("email1") String email,
			@RequestParam("pass1") String pass,Model model,
			HttpServletRequest request
			)
    {
		HttpSession s = request.getSession();
		String page = "login";
    	if(email.equals("admin@gmail.com") 
    			&& pass.equals("admin"))
    	{
    		page = "profile-admin";
    	}
    	else
    	{
    		
    		Employee e = empService.findEmpBYEmail(email);
    		if(e != null && e.getPassword().equals(pass))
    		{
    			s.setAttribute("employee", e);
    			page = "profile-employee";
    			
    		}
    		else
    		{
    			page = "login";
       	     model.addAttribute("model_error","not valid credentials");
       	     
    		}
    	     
    	}
    	return page;
    }
	
}
