package at.apa_it.ACD.service;

import java.net.URI;
import java.util.List;

import org.json.JSONArray;

import at.apa_it.ACD.domain.User;

import com.sun.jersey.api.client.ClientResponse;

public interface RestService {
	public ClientResponse rest(String input, String relativeUrl);
	public User authUser(String user, String password);
	public URI getBaseURI();
	public List<String> getList(JSONArray ja);
}
