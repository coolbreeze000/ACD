package at.apa_it.ACD.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import at.apa_it.ACD.domain.AuthToken;

public interface AuthTokenRepository extends CrudRepository<AuthToken, Long>{
	public AuthToken findByUqId(String uqid);
	@Override
	public List<AuthToken> findAll();
}
