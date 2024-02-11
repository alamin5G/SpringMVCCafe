package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SecondController {


	@RequestMapping("/kitchen")
	public String kitchenRoom() {
		
		return "kitchenpage";
	}
}
