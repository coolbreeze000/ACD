package at.apa_it.ACD.repository;

import org.springframework.data.repository.CrudRepository;

import at.apa_it.ACD.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	public User findByUsername(String username);
}