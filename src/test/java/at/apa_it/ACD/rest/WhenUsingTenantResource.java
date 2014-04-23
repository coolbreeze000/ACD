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
public class  WhenUsingTenantResource {

    @Resource
    private WebApplicationContext webApplicationContext;

    @Test
    public void EnsureTenantResourceReturnsTenantListCorrectly() throws Exception {
        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(get("/tenants/")).
                andExpect(status().isOk());
    }

    @Test
    public void EnsureTenantResourceAddsNewTenantCorrectly() throws Exception {
        MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(
                        post("/tenants/").
                                contentType(MediaType.APPLICATION_JSON).
                                content("{\"description\":\"Tenant for special..\", \"enabled\":\"true\", \"uqid\":\"id5455\"}")).
                andExpect(status().isCreated());
    }
    
    @Test
	public void EnsureTenantResourceReturnsAddedTenantSizeCorrectly() throws Exception {
    	MockMvc mockMvc = webAppContextSetup(webApplicationContext).build();

        mockMvc.
                perform(
                        post("/tenants/").
                                contentType(MediaType.APPLICATION_JSON).
                                content("{\"description\":\"Tenant for poject xx..\", \"enabled\":\"true\", \"uqid\":\"idx5555\"}")).
                andExpect(status().isCreated());

        mockMvc.
        		perform(get("/tenants/")).
        		andExpect(status().isOk());
	}
}