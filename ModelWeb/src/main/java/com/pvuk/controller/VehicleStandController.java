package com.pvuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VehicleStandController {
	
	@RequestMapping(value = "/bikeStandHome", method = RequestMethod.GET)
	public String bikeStandHome(ModelMap modelMap) {
		modelMap.addAttribute("message", "Welcome to BikeStand");
		return "bikestand/bikestand";
	}

}
