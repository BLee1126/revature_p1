package com.brian.UserTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.brian.models.User;
import com.brian.repository.UserRepository;
import com.brian.services.CreateUserService;
import com.brian.services.UserService;

@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserService userService;
	
	

	@BeforeAll
	public void setup() {
		MockitoAnnotations.openMocks(this);
		this.userService = new UserService();

	}
	
	@Test
	public void whenSaveUser_shouldReturnUser() {
		User user = new User();
		user.setUserName("Test Name");
		when(userRepository.save(ArgumentMatchers.any(User.class))).thenReturn(user);
		User created = userService.save(user);
		assertThat(created.getUserName()).isSameAs(user.getUserName());
		verify(userRepository).save(user);
	}



}
