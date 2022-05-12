package com.brian.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.models.User;
import com.brian.repository.UserRepository;

@Service
public class DeleteUserService {
@Autowired
UserRepository repository;
	public void deleteUser(int id) {
	repository.findById(id);
	
	repository.deleteById(id);
	}
}