package at.apa_it.ACD.repository;

import org.springframework.data.repository.CrudRepository;

import at.apa_it.ACD.domain.Tenant;

public interface TenantRepository extends CrudRepository<Tenant, Long>{
	public Tenant findByUqId(String uqid);
}
