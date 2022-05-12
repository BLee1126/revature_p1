package com.brian.repository;
import com.brian.models.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{
	public List<User> findAll();
	public User findByUserName(String userName);
	public <S extends User> S save(User user);
	public void deleteById(int id);
}
