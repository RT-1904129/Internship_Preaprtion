package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChefController {
	
	// so than spring convert return value (write in) http response
//	@ResponseBody
	// it will respond only when hello typed in url
	@RequestMapping("/hello")
	
	// Model work as container that contains data of application
//	 a data can be in any form such as objects, strings, information from the database, etc
	public String setup(Model model) {
		String msg = "Your food(non-veg) is ready !";
		
		int orderId = 45153;
		String CustName = "James";
		
		model.addAttribute("id",orderId);
		model.addAttribute("name",CustName);
		model.addAttribute("message",msg);
		return "/WEB-INF/jsp/food.jsp";
	}

}
