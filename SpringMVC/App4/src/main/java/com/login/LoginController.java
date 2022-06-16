package com.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		return "/WEB-INF/jsp/login.jsp";
	}
	
	@RequestMapping("/registration")
	public String register() {
		return "/WEB-INF/jsp/registration.jsp";
	}
	
	// Model work as container that contains data of application
	//	 a data can be in any form such as objects, strings, information from the database, etc
	// 	Interface HttpServletRequest. Extends the ServletRequest interface to provide request information for HTTP servlets.
	@RequestMapping("/btnRegisterClick")
	public String registerButton(HttpServletRequest req,Model model){
		
		if(req.getParameter("user_name")!= ""&& req.getParameter("user_email")!= "" && req.getParameter("user_password") != "") {
			model.addAttribute("username",req.getParameter("user_name"));
			model.addAttribute("useremail",req.getParameter("user_email"));
			model.addAttribute("userpassword",req.getParameter("user_password"));
			model.addAttribute("msg","you registartion sucessful");
			return "/WEB-INF/jsp/login.jsp";
		}
		else {
			return  "/WEB-INF/jsp/registration.jsp" ;
		}
	}
	
}
