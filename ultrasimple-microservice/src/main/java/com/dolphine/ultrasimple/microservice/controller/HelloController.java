package com.dolphine.ultrasimple.microservice.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan
@RestController
public class HelloController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String helloWorld(@RequestParam String name) {
		return "Olá " + name;
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public Map<String,String> helloWorldJson(@RequestParam String name) {
		Map<String,String> obj=new LinkedHashMap<String,String>();
		obj.put("message", "Olá "+name);
		return obj;
	}
	
	public static void main(String... args) throws Exception {
		SpringApplication.run(HelloController.class, args);
	}
	
}
