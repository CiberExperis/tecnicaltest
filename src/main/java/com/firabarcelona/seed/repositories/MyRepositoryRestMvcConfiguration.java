package com.firabarcelona.seed.repositories;


import com.firabarcelona.seed.entities.Language;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class MyRepositoryRestMvcConfiguration extends RepositoryRestConfigurerAdapter {
    @Value("${seed.api.version}")
    String seedApiVersion;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Language.class);
        config.setBasePath(seedApiVersion);
    }
}
