package com.example.MyFirstBootApp;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/result")
	// we are using HttpServaletRequest for multiple keys we can do it by just
	// public String index(String data, HttpSession session ) {
//		System.out.println("data"+data);
//		session.setAttribute("value", data);
//		return result;
//		}
	
	// @RequestParam is more useful because if in result.jsp parmeter data is change as val than also we need not to chnage dat as val parmeter in 
	// IndexController because it will store val value in data parameter.
		// public String index(@RequestParam("val") String data, HttpSession session ) {
//			System.out.println("data"+data);
//			session.setAttribute("value", data);
//			return result;
//			}
//	public String index(HttpServletRequest request) {
//		System.out.println("Value :"+request.getParameter("data"));
//		
//		// it work same as model as container
//		HttpSession session = request.getSession();
//		session.setAttribute("value", request.getParameter("data"));
//		return "result";
//	}
	public  ModelAndView index(@RequestParam("val") String data) {
//		Map<String,String>map = new HashMap<String,String>();
//		map.put("value",data);
//		return new ModelAndView("result",map);
//		System.out.println("Value :"+request.getParameter("data"));
		
		ModelAndView mv =  new ModelAndView("result");
		mv.addObject("value",data);
		return mv;  
		
	}
}
