package com.RestApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping
	public String getUsers() {
		return "<h1>Fetching user...</h1>";
	}
	@PostMapping
	public ResponseEntity<String> setUser(@RequestBody String name) {
		String names= name+"User Added Sucessfully";
		return ResponseEntity.ok(names);
	}
	@PutMapping
	public String updateUser() {
		return "user updated";
	}
	@DeleteMapping
	public String delelteUser() {
		return "user deleted";
	
	}
	

}
