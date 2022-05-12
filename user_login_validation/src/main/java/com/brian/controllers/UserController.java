package com.brian.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brian.models.User;
import com.brian.services.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired UserService userService;
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/id/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return userService.findById(id);
	}
	
	@GetMapping("/username/{username}")
	public User getUserByUN(@PathVariable String username) {
		return userService.findByUserName(username);
	}
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User createUser(@RequestBody User user) {	
		return userService.save(user);
	}
	

	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		return userService.save(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.delete(id);
	}
	
	
}
