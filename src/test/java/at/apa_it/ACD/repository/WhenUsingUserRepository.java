package at.apa_it.ACD.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import at.apa_it.ACD.domain.User;

@ContextConfiguration(classes = RepositoryTestConfiguration.class)
public class WhenUsingUserRepository extends AbstractJUnit4SpringContextTests {

    @Autowired
    UserRepository userRepository;

    @Before
    public void setup() {
        userRepository.deleteAll();

        userRepository.save(new User("User1"));
        userRepository.save(new User("User2"));
        userRepository.save(new User("User3"));
    }

    @Test
    public void EnsureUsersCanBeFoundByUsernameCorrectly() {
        List<User> byName = userRepository.findByUsername("User1");

        Assert.assertNotNull(byName);
        Assert.assertEquals(1, byName.size());
        Assert.assertNotNull(byName.get(0));
    }
}
