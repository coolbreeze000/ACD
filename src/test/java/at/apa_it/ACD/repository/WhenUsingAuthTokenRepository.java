package at.apa_it.ACD.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import at.apa_it.ACD.domain.AuthToken;

@ContextConfiguration(classes = RepositoryTestConfiguration.class)
public class WhenUsingAuthTokenRepository extends AbstractJUnit4SpringContextTests {

    @Autowired
    AuthTokenRepository authTokenRepository;

    @Before
    public void setup() {
        authTokenRepository.deleteAll();

        authTokenRepository.save(new AuthToken("tokenxxfxx22222"));
        authTokenRepository.save(new AuthToken("tokenxxxx22dfhdgjgdjghx222"));
        authTokenRepository.save(new AuthToken("tokenxxxx222fgfdgdd22"));
    }

    @Test
    public void EnsureAuthTokenCanBeFoundByUqIdCorrectly() {
        AuthToken byUqId = authTokenRepository.findByUqId("tokenxxfxx22222");

        Assert.assertNotNull(byUqId);
        Assert.assertEquals(byUqId.getUqid(), "tokenxxfxx22222");
    }
}
