package at.apa_it.ACD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.apa_it.ACD.domain.AuthToken;
import at.apa_it.ACD.domain.Tenant;
import at.apa_it.ACD.repository.AuthTokenRepository;
import at.apa_it.ACD.repository.TenantRepository;

@Service
public class ServiceAuthToken {
	
	@Autowired
	private AuthTokenRepository authTokenRepository;
	
	public ServiceAuthToken() {
	}
	
	public void saveTenant(AuthToken authToken)
	{
		authTokenRepository.save(authToken);
	}
	
	public List<AuthToken> getAllAuthTokens()
	{
		return authTokenRepository.findAll();
	}
}
