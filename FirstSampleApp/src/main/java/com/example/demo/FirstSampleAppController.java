package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FirstSampleAppController {

	@RequestMapping("/Hello")
	public String sayHello() {
		return "<h1>hello! UserApp</h1>";
	}
	
	
}
