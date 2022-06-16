package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// it is used to mark the class as a web request handler 
// it indicates that a particular class serves the role of controller

@Controller
@RequestMapping("/hello4")
public class ChefController {
	

	// so than spring convert return value (write in) in http response
	@ResponseBody
	// it will respond only when hello typed in url here hello is handler
	@RequestMapping("/hello")
	String setup(@RequestAttribute("orderId") String id) {
		return "<h1> your veg food is ready !! </h1> and your order =" +id ;
	}


}
