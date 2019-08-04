package com.susmi.herokudemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	public String home(){
		return "hello";
	}

}
