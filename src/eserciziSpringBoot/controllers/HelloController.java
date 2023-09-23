package eserciziSpringBoot.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/greeting")
	public ResponseEntity<String> greetings(){
		return new ResponseEntity<>("Good Afternoon", HttpStatusCode.valueOf(200));
	}


}
