package at.apa_it.ACD.servicejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.repositoryjpa.UserJpaRepository;

@Service
public class ServiceJpaUser {
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	public void createNewUser(String username)
	{
		User user = new User(username);
		userJpaRepository.persist(user);
	}

	public UserJpaRepository getUserJpaRepository() {
		return userJpaRepository;
	}

	public void setUserJpaRepository(UserJpaRepository userJpaRepository) {
		this.userJpaRepository = userJpaRepository;
	}
	
	
}
