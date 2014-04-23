package at.apa_it.ACD.servicejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.apa_it.ACD.domain.AuthToken;
import at.apa_it.ACD.repositoryjpa.AuthTokenJpaRepository;

@Service
public class ServiceJpaAuthToken {
	
	@Autowired
	private AuthTokenJpaRepository authTokenJpaRepository;
	
	public void createNewAuthToken(String uqid)
	{
		AuthToken authToken = new AuthToken(uqid);
		authTokenJpaRepository.persist(authToken);
	}

	public AuthTokenJpaRepository getAuthTokenJpaRepository() {
		return authTokenJpaRepository;
	}

	public void setAuthTokenJpaRepository(
			AuthTokenJpaRepository authTokenJpaRepository) {
		this.authTokenJpaRepository = authTokenJpaRepository;
	}
	
}
