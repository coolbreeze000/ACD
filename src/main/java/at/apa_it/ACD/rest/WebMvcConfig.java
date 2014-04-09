package at.apa_it.ACD.rest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackageClasses = {UserResource.class})
@Configuration
public class WebMvcConfig {

}
