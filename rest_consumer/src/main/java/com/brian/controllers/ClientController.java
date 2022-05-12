package com.brian.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.brian.models.User;

@RestController
public class ClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/users/all")
	public List<User> findallUsers() {
		ResponseEntity<List> list = restTemplate.getForEntity("http://localhost:8001/users/all/", List.class);
		List<User> users = list.getBody();
		return users;
		
	}
	

	@GetMapping("/users/id")
	public User getUserById(@RequestParam int id) {
		ResponseEntity<User> user = restTemplate.getForEntity("http://localhost:8001/users/id/" + id, User.class);
		return user.getBody();
		
	}
	
	@PostMapping("/users/create")
	public User saveUser(@RequestBody User user) {
		ResponseEntity<User> response = restTemplate.postForEntity("http://localhost:8001/users/create", user, User.class);
		return response.getBody();
	}
	
	@PutMapping("users/update")
	public void updateUser( @RequestBody User user) {
		restTemplate.put("http://localhost:8001/users/update/" + user.getUserId(), user);
	}
	
	@DeleteMapping("/users/delete")
	public void deleteUserById(@RequestParam int id) {
		restTemplate.delete("http://localhost:8001/users/delete/" + id);
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
		
	}
}
