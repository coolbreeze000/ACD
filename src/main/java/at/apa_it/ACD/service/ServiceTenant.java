package at.apa_it.ACD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import at.apa_it.ACD.domain.Tenant;
import at.apa_it.ACD.repository.TenantRepository;

public class ServiceTenant {
	
	@Autowired
	private TenantRepository tenantRepository;
	
	public ServiceTenant() {
	}
	
	public void saveTenant(Tenant tenant)
	{
		tenantRepository.save(tenant);
	}
	
	public List<Tenant> getAllTenants()
	{
		return tenantRepository.findAll();
	}
}
