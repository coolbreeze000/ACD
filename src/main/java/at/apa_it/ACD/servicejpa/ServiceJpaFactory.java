package at.apa_it.ACD.servicejpa;

import at.apa_it.ACD.service.ServiceAuthToken;

public interface ServiceJpaFactory {
	public ServiceJpaUser serviceJpaUser();
	public ServiceJpaTenant serviceJpaTenant();
	public ServiceJpaAuthToken serviceJpaAuthToken();
}
