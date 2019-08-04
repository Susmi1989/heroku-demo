package com.susmi.herokudemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susmi.herokudemo.model.Person;
import com.susmi.herokudemo.repository.PersonRepo;

@RestController
public class HomeController {
	
	@Autowired
	PersonRepo repo;
	
	@GetMapping("/hello")
	public String home(){
		return "hello";
	}
	
	@RequestMapping("/")
	public String saveToDB(){
		Person person = new Person();
		
		person.setName("Susmi");
		person.setCompany("HCL");
		repo.save(person);
		
		return "success";
	}
	
	

}
