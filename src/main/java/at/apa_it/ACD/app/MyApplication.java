package at.apa_it.ACD.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import at.apa_it.ACD.repositoryjpa.PersistenceFactory;
import at.apa_it.ACD.servicejpa.ServiceJpaFactory;

/**
*
*/
public class MyApplication {

    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private PersistenceFactory persistenceFactory;

    private ServiceJpaFactory serviceFactory;

    public MyApplication() {
        entityManagerFactory = Persistence.createEntityManagerFactory("spengergassePU");
        entityManager = entityManagerFactory.createEntityManager();
        persistenceFactory = new PersistenceFactoryImpl(entityManager);
        serviceFactory = new ServiceFactoryImpl(persistenceFactory);
    }

    public void doSomething() {

    }

    public void teardown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.doSomething();
        myApplication.teardown();
    }
}