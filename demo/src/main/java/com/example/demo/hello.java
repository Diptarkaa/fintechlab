
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.ControllerAdvice;

@RestController
public class hello {
	@GetMapping("/")
	public String hello()
	{
		return "Welcome";
	}
}
