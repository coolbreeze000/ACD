package at.apa_it.ACD.servicejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.apa_it.ACD.domain.Tenant;
import at.apa_it.ACD.repositoryjpa.TenantJpaRepository;

@Service
public class ServiceJpaTenant {
	
	@Autowired
	private TenantJpaRepository tenantJpaRepository;
	
	public void createNewTenant(String description, boolean enabled)
	{
		Tenant tenant = new Tenant(description, enabled, "");
		tenantJpaRepository.persist(tenant);
	}

	public TenantJpaRepository getTenantJpaRepository() {
		return tenantJpaRepository;
	}

	public void setTenantJpaRepository(TenantJpaRepository tenantJpaRepository) {
		this.tenantJpaRepository = tenantJpaRepository;
	}
	
}
