package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Robin-ou
 *
 */
@RestController
public class IndexController {

	@Autowired
	private Person person;

	@RequestMapping("/index")
	public String index() {
		System.out.println(person.getName() + " " + person.getAge() + " " + person.getDesc());
		return "hello Springboot 2.0";

	}

	@RequestMapping("/sayPerson")
	public String sayPerson() {

		return person.toString();

	}
}
