package at.apa_it.ACD.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import at.apa_it.ACD.domain.AuthToken;

@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class WhenUsingServiceAuthToken extends AbstractJUnit4SpringContextTests {

    @Autowired
    ServiceAuthToken serviceAuthToken;

    @Test
	public void EnsureServiceTenantConstructsCorrectly() throws Exception {
		Assert.assertNotNull(serviceAuthToken);
	}
    
    @Test
	public void EnsureServiceUserSavesUserCorrectly() throws Exception {
		AuthToken authToken = new AuthToken("tokenxxx222");
		serviceAuthToken.saveAuthToken(authToken);
		
		Assert.assertTrue(serviceAuthToken.getAllAuthTokens().contains(authToken));
	}
    
    @Test
	public void EnsureServiceUserReturnsAllUsersCorrectly() throws Exception {
    	AuthToken authToken = new AuthToken("tenant555");
    	serviceAuthToken.saveAuthToken(authToken);
		
		Assert.assertTrue(serviceAuthToken.getAllAuthTokens().contains(authToken));
	}
}
