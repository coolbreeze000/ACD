package at.apa_it.ACD.repository;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import at.apa_it.ACD.domain.User;

public class WhenUsingUserRepository extends AbstractJUnit4SpringContextTests{

//	@Autowired
//	UserRepository userRepository;
//	
//	@Before
//    public void setup() {
//        userRepository.deleteAll();
//    }
//
//    @Test
//    public void EnsureNotExistingUserCantBeFoundByUsernameCorrectly() throws Exception{
//    	User user = userRepository.findByUsername("NullUser");
//    	
//    	assertThat(user, is(nullValue()));
//    }
}
