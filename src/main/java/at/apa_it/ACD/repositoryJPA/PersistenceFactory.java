package at.apa_it.ACD.repositoryJPA;

public interface PersistenceFactory {
	
    UserJpaRepository userJpaRepository();
    TenantJpaRepository tenantJpaRepository();
    AuthTokenJpaRepository authTokenJpaRepository();
}