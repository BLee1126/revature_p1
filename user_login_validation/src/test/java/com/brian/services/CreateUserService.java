package com.brian.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.models.User;
import com.brian.repository.UserRepository;

@Service
public class CreateUserService {
	@Autowired
	UserRepository repository;
	public User createNewUser(User user) {
		return repository.save(user);
	}
}