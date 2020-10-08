package com.vmware.trellis.discoverychecker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@EnableDiscoveryClient
@Slf4j
public class DiscoveryCheckerComponent {

    private DiscoveryClient discoveryClient;

    @Autowired
    public DiscoveryCheckerComponent(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    public List<String> getServiceList() {
        List<String> serviceIds = discoveryClient.getServices();

        if (null == serviceIds) {
            log.warn("DiscoveryClient returned NULL");
            return new ArrayList<String>();
        } else if (serviceIds.size() == 0) {
            log.info("DiscoveryClient returned an EMPTY list.");
            return serviceIds;
        } else {
            log.info("DiscoveryClient returned {} services.", serviceIds.size());
            return serviceIds;
        }
    }


    public List<ServiceInstance> getServiceInstancesByApplicationName(String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
