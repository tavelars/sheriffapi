package com.cloud.sheriff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sheriff/api")
public class SheriffApiController {
	
	@GetMapping(path = "/sayhello/{name}")
	public ResponseEntity<?> sayHello(@PathVariable final String name) {
		return ResponseEntity.ok("Welcome to Sheriff API: ".concat(name));
	}

}
