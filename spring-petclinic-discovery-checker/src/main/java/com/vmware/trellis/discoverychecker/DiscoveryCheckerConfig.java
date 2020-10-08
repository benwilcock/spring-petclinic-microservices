package com.vmware.trellis.discoverychecker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DiscoveryCheckerConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
