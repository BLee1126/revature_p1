package com.brian.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.models.User;
import com.brian.repository.UserRepository;

@Service("userService")
public class UserService {
	
	private UserRepository userRepository;
	
	
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public User findByUserName(String userName) {
		return this.userRepository.findByUserName(userName);
		
	}


	
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}


	
	public void receiveMessage(String message) {
		System.out.println(message);
		
	}

	public Optional<User> findById(int id) {
		return this.userRepository.findById(id);
	}

	public void delete(int id) {
		this.userRepository.deleteById(id);
	}

}
