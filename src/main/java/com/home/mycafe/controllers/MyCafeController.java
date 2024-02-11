package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	@RequestMapping("/cafe")
	public String welcomeToCafe(Model model) {
		
		String myName = "Alamin";
		String myCafeName = "Alamin";
		
		model.addAttribute("Myvalueis", myName);
		model.addAttribute("cafeName", myCafeName);
		
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String cafeOrderProcess(HttpServletRequest httpServletRequest, Model model) {
		
		String getParamValue = httpServletRequest.getParameter("foodType");
		model.addAttribute("userInputItem", getParamValue);
		
		return "process-order";
	}

}
