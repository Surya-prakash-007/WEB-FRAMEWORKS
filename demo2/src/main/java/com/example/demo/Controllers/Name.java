package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	
	@GetMapping("/doom")
	public String fun(String n1,int n2) {
//		n="Sam";
		
		return "Hello " + n1 +" "+n2;
	}
}
