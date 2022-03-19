package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

	@GetMapping("/hello")
	public String exp1() {
		
		
		return "Hello good Morning";
	}
}
