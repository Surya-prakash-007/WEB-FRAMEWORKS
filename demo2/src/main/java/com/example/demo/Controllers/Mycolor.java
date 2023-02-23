package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycolor {
	@Value("green")
	private String Myfav;
	
	
	@GetMapping("/")
	public String getMyFav(String FavColor)
	{
		return "My Favourite Color is " + Myfav;
	}
}