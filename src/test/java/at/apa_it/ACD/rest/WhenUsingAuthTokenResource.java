package at.apa_it.ACD.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class, classes = RestApplicationConfig.class)
@WebAppConfiguration
public class  WhenUsingAuthTokenResource {

    @Resource
    private WebApplicationContext webApplicationContext;

//    @Test
//    public void EnsureAuthTokenResourceReturnsAuthTokenListCorrectly() throws Exception {
//        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();
//
//        mockMvc.
//                perform(get("/authTokens/")).
//                andExpect(status().isOk());
//    }
//
//    @Test
//    public void EnsureAuthTokenResourceAddsNewAuthTokenCorrectly() throws Exception {
//        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();
//
//        mockMvc.
//                perform(
//                        post("/authTokens/").
//                                contentType(MediaType.APPLICATION_JSON).
//                                content("{\"uqid\":\"xxx111\"}")).
//                andExpect(status().isCreated());
//    }
    
    @Test
	public void EnsureAuthTokenResourceReturnsAddedAuthTokenSizeCorrectly() throws Exception {
    	MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(
                        post("/authTokens/").
                                contentType(MediaType.APPLICATION_JSON).
                                content("{\"uqid\":\"UQID111222333\"}")).
                andExpect(status().isCreated());

        mockMvc.
        		perform(get("/authTokens/")).
        		andExpect(status().isOk());
	}
}