package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/help2")
public class appp2 {

	@ResponseBody
	@RequestMapping("/help1")
	String setup() {
		return "I am testing1";
	}

}
