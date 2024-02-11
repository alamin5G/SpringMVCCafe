package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sports")
public class SportsController {
	
	@RequestMapping("/baseball")
	public String baseBall() {
		
		return "baseballpage";
	}
	
	
	@RequestMapping("/football")
	public String footBall() {
		
		return "footballpage";
	}
	
	@RequestMapping("/cricketball")
	public String cricBall() {
		
		return "cricketpage";
	}
	

}
