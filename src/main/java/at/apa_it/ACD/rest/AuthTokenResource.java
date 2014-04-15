package at.apa_it.ACD.rest;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import at.apa_it.ACD.domain.AuthToken;
import at.apa_it.ACD.domain.User;
import at.apa_it.ACD.service.ServiceAuthToken;


@Controller
@RequestMapping(value="/authTokens")
public class AuthTokenResource {
	
	private ServiceAuthToken serviceAuthToken;
	
	public AuthTokenResource() {
		serviceAuthToken = new ServiceAuthToken();
	}
	
	@RequestMapping(value={"", "/"}, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	@ResponseBody
	public List<AuthToken> findAllAuthTokens()
	{
		return serviceAuthToken.getAllAuthTokens();
	}
	
	@RequestMapping(value="/", consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	@ResponseBody
	public void saveAuthToken(@RequestBody AuthToken authToken)
	{
		serviceAuthToken.saveTenant(authToken);
	}
}
