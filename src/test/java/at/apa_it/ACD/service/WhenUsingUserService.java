package at.apa_it.ACD.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import at.apa_it.ACD.domain.User;

@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class WhenUsingUserService extends AbstractJUnit4SpringContextTests {

    @Autowired
    ServiceUser serviceUser;

    @Test
	public void EnsureServiceUserConstructsCorrectly() throws Exception {
		Assert.assertNotNull(serviceUser);
	}
    
    @Test
	public void EnsureServiceUserSavesUserCorrectly() throws Exception {
		User user = new User("userx");
		serviceUser.saveUser(user);
		
		Assert.assertTrue(serviceUser.getAllUsers().contains(user));
	}
    
    @Test
	public void EnsureServiceUserReturnsAllUsersCorrectly() throws Exception {
    	User user = new User("userx2");
		serviceUser.saveUser(user);
		
		Assert.assertTrue(serviceUser.getAllUsers().contains(user));
	}
}
