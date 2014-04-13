package at.apa_it.ACD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.repository.UserRepository;

public class ServiceUser {
	
	@Autowired
	private UserRepository userRepository;
	
	public ServiceUser() {
	}
	
	public void saveUser(User user)
	{
		userRepository.save(user);
	}
	
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
}
