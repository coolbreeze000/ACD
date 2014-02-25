package at.apa_it.ACD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.repository.UserRepository;

@Service
public class ApaCloudDashboardService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void createNewUser(String username)
	{
		User user = new User(username);
		userRepository.save(user);
	}
}
