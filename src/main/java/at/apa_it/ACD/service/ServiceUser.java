package at.apa_it.ACD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.repository.UserRepository;

@Service
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
