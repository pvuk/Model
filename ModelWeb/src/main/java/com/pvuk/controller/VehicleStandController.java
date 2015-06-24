package com.pvuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pvuk.controller.bean.vehicleBean;

@Controller
public class VehicleStandController {
	
	@RequestMapping(value = "/vehicleHome", method = RequestMethod.GET)
	public String vehicleHome(ModelMap modelMap) {
		modelMap.addAttribute("message", "Welcome to Vehicle Stand");
		
		vehicleBean vehicleBean = new vehicleBean();
		modelMap.addAttribute("vehicleBean", vehicleBean);
		
		return "vehiclestand/vehiclestand";
	}

}
