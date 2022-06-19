package com.example.SmallWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistartionController {
	
	@RequestMapping("/regform")
	public String register() {
		return "registration";
	}
	
//	@RequestMapping("/userDetails")
//	public ModelAndView userDetails(UserRegistation reg) {
////		System.out.println(	"I am detail .."+ reg.getUName());
//		ModelMap model = new ModelMap();
//		model.addAttribute("name",reg.getUName());
//		model.addAttribute("email",reg.getEmailId());
//		model.addAttribute("gender",reg.getGender()== Integer.parseInt("1")? "Male": "Female");
//		model.addAttribute("hobbies",reg.getHobby());
//		
//		ModelAndView mv = new ModelAndView("user-details");
//		mv.addObject("regObj",model);
//		return mv;
//	}
	
	@RequestMapping("/userDetails")
	public String userDetails(UserRegistation reg) {
		return "operation";
	}
	
	
	@RequestMapping("/operation")
	public String operation() {
		return "operation";
	}
}
