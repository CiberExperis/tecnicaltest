package com.firabarcelona;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@Configuration
public class CommonServiceConfiguration {

    @Value("${seed.api.version}")
    String seedApiVersion;

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    @Bean
    public PermitEntryPoints getCommonServicePermitEntryPoints() {
        return new PermitEntryPoints() {
            @Override
            public String[] getEntryPoints() {
                return new String[] {
                        "/health",
                        //This is open to allow other apis to call for the default account at startup.
                        "/"+ seedApiVersion +"/languages"
                };
            }
        };
    }

}
