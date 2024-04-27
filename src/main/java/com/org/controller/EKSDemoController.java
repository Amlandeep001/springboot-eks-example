package com.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EKSDemoController
{
	@GetMapping("/greetings")
	public String message()
	{
		return "Welcome to Amlan's space ! app deployed in AWS EKS";
	}
}
