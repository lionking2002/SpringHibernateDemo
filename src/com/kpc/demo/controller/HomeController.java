package com.kpc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpc.demo.model.Person;
import com.kpc.demo.service.PersonService;

@RestController
public class HomeController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/")
	public String index() {
		List<Person> personList = personService.getAllPerson();
		return "index";
	}
}
