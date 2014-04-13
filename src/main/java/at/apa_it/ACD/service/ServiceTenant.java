package at.apa_it.ACD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.apa_it.ACD.domain.Tenant;
import at.apa_it.ACD.repository.TenantRepository;

@Service
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
