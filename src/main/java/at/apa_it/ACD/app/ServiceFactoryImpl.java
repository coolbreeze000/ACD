package at.apa_it.ACD.app;

import java.util.HashMap;

import at.apa_it.ACD.repositoryjpa.PersistenceFactory;
import at.apa_it.ACD.servicejpa.ServiceJpa;
import at.apa_it.ACD.servicejpa.ServiceJpaAuthToken;
import at.apa_it.ACD.servicejpa.ServiceJpaFactory;
import at.apa_it.ACD.servicejpa.ServiceJpaTenant;
import at.apa_it.ACD.servicejpa.ServiceJpaUser;

public class ServiceFactoryImpl implements ServiceJpaFactory{

	private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }
	

	@Override
	public ServiceJpaUser serviceJpaUser() {
		ServiceJpaUser serviceJpaUser = new ServiceJpaUser();
		serviceJpaUser.setUserJpaRepository(persistenceFactory.userJpaRepository());
		return serviceJpaUser;
	}

	@Override
	public ServiceJpaTenant serviceJpaTenant() {
		ServiceJpaTenant serviceJpaTenant = new ServiceJpaTenant();
		serviceJpaTenant.setTenantJpaRepository(persistenceFactory.tenantJpaRepository());
		return serviceJpaTenant;
	}

	@Override
	public ServiceJpaAuthToken serviceJpaAuthToken() {
		ServiceJpaAuthToken serviceJpaAuthToken = new ServiceJpaAuthToken();
		serviceJpaAuthToken.setAuthTokenJpaRepository(persistenceFactory.authTokenJpaRepository());
		return serviceJpaAuthToken;
	}

}
