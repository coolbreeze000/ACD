package at.apa_it.ACD.service;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import at.apa_it.ACD.domain.DomainConfiguration;
import at.apa_it.ACD.repository.RepositoryConfiguration;

@Configuration
@Import({DomainConfiguration.class, RepositoryConfiguration.class, ServiceConfiguration.class})
public class ServiceTestConfiguration {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}