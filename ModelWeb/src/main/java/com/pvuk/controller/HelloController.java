package com.pvuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
	
	public static void main(String[] args)
    {
        Integer i1 = 127;
 
        Integer i2 = 127;
 
        System.out.println(i1 == i2);
 
        Integer i3 = 128;
 
        Integer i4 = 128;
 
        System.out.println(i3 == i4);
    }
	
}