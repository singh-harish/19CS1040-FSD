package com.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World by Harish Singh";
	}
}
