package at.apa_it.ACD.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.repository.UserRepository;


@Controller
@RequestMapping(value="/users")
public class UserResource {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping(value="/", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<User> findAllUsers()
	{
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/", consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void saveUser(@RequestBody User user)
	{
		userRepository.save(user);
	}
}
