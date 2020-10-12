package com.vmware.trellis.discoverychecker;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
@EnableScheduling
public class ScheduledDiscoveryLogger {

    private DiscoveryCheckerComponent discoveryChecker;
    private RestTemplate restTemplate;

    @Autowired
    public ScheduledDiscoveryLogger(DiscoveryCheckerComponent discoveryCheckerComponent, RestTemplate systemRestTemplate) {
        this.discoveryChecker = discoveryCheckerComponent;
        this.restTemplate = systemRestTemplate;
    }

    @SneakyThrows
    @Scheduled(fixedRate = 30000)
    protected void checkRegistry() {
        List<String> serviceIds = this.discoveryChecker.getServiceList();
        serviceIds.stream().forEach(s -> log.info("Found listing in registry for application: {}", s));
        serviceIds.stream().forEach(s -> log.info("Known Instances: {}", this.discoveryChecker.getServiceInstancesByApplicationName(s)));

        if (null != serviceIds && serviceIds.contains("config-checker")) {
            ServiceInstance configChecker = this.discoveryChecker.getServiceInstancesByApplicationName("config-checker").get(0);
            if (null != configChecker) {
                String message = this.restTemplate.getForObject(configChecker.getUri() + "/message", String.class);
                log.info("I called the Config Checker on {}, and it said '{}'.", configChecker.getUri() + "/message", message);
            }
        }
    }
}
