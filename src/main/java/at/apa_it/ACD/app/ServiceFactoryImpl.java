package at.apa_it.ACD.app;

import java.util.HashMap;

import at.apa_it.ACD.repositoryjpa.PersistenceFactory;
import at.apa_it.ACD.servicejpa.ApaCloudDashboardServiceJpa;
import at.apa_it.ACD.servicejpa.ServiceJpa;
import at.apa_it.ACD.servicejpa.ServiceJpaFactory;

public class ServiceFactoryImpl implements ServiceJpaFactory{

	private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }
	
	@Override
	public ApaCloudDashboardServiceJpa apaCloudDashboardServiceJpa() {
		ApaCloudDashboardServiceJpa apaCloudDashboardServiceJpa = new ApaCloudDashboardServiceJpa();
		apaCloudDashboardServiceJpa.setUserJpaRepository(persistenceFactory.userJpaRepository());
		return apaCloudDashboardServiceJpa;
	}

}
