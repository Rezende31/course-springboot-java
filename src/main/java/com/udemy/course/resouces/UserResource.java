package com.udemy.course.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "teste", "teste@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	}
}
