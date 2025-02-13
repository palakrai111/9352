package in.sp.testingspring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class xcontrol {
	@GetMapping("/home")
    public String user() 
    {
   	 return "home";
    }
}
