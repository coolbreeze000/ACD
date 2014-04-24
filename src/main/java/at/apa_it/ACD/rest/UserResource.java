package at.apa_it.ACD.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.service.ServiceUser;


@Controller
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private ServiceUser serviceUser;
	
	@RequestMapping(value={"", "/"}, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	@ResponseBody
	public List<User> findAllUsers()
	{
		return serviceUser.getAllUsers();
	}
	
	@RequestMapping(value={"", "/"}, consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	@ResponseBody
	public void saveUser(@RequestBody User user)
	{
		serviceUser.saveUser(user);
	}
}
