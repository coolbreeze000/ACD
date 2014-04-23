package at.apa_it.ACD.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import at.apa_it.ACD.domain.Tenant;

@ContextConfiguration(classes = RepositoryTestConfiguration.class)
public class WhenUsingTenantRepository extends AbstractJUnit4SpringContextTests {

    @Autowired
    TenantRepository tenantRepository;

    @Before
    public void setup() {
        tenantRepository.deleteAll();

        tenantRepository.save(new Tenant("Tenant for 1", true, "UQID1"));
        tenantRepository.save(new Tenant("Tenant for 3", true, "UQID2"));
        tenantRepository.save(new Tenant("Tenant for 2", true, "UQID3"));
    }

    @Test
    public void EnsureTenantsCanBeFoundByUqIdCorrectly() {
        Tenant byUqId = tenantRepository.findByUqId("UQID3");

        Assert.assertNotNull(byUqId);
        Assert.assertEquals(byUqId.getUqid(), "UQID3");
    }
}
