package at.apa_it.ACD.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import at.apa_it.ACD.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	public List<User> findByUsername(String username);
	@Override
	public List<User> findAll();
}