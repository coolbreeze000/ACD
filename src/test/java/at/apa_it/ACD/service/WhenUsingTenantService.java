package at.apa_it.ACD.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import at.apa_it.ACD.domain.Tenant;

@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class WhenUsingTenantService extends AbstractJUnit4SpringContextTests {

    @Autowired
    ServiceTenant serviceTenant;

    @Test
	public void EnsureServiceTenantConstructsCorrectly() throws Exception {
		Assert.assertNotNull(serviceTenant);
	}
    
    @Test
	public void EnsureServiceUserSavesUserCorrectly() throws Exception {
		Tenant tenant = new Tenant("tenant1",true, "UQ1");
		serviceTenant.saveTenant(tenant);
		
		Assert.assertTrue(serviceTenant.getAllTenants().contains(tenant));
	}
    
    @Test
	public void EnsureServiceUserReturnsAllUsersCorrectly() throws Exception {
    	Tenant tenant = new Tenant("tenant2",true, "UQ22");
    	serviceTenant.saveTenant(tenant);
		
		Assert.assertTrue(serviceTenant.getAllTenants().contains(tenant));
	}
}
