package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	@RequestMapping("/bed")
	public String bedSheet() {
		
		
		return "bedpage";
		
	}

}
