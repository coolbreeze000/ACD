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

import at.apa_it.ACD.domain.AuthToken;
import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.service.ServiceAuthToken;


@Controller
@RequestMapping(value="/authTokens")
public class AuthTokenResource {
	
	@Autowired
	private ServiceAuthToken serviceAuthToken;
	
	
	@RequestMapping(value={"", "/"}, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	@ResponseBody
	public List<AuthToken> findAllAuthTokens()
	{
		return serviceAuthToken.getAllAuthTokens();
	}
	
	@RequestMapping(value={"", "/"}, consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	@ResponseBody
	public void saveAuthToken(@RequestBody AuthToken authToken)
	{
		serviceAuthToken.saveAuthToken(authToken);
	}
}
