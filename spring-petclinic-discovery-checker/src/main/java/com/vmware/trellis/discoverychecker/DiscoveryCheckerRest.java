package com.vmware.trellis.discoverychecker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryCheckerRest {

    private DiscoveryCheckerComponent discoveryCheckerComponent;

    @Autowired
    public DiscoveryCheckerRest(DiscoveryCheckerComponent discoveryCheckerComponent) {
        this.discoveryCheckerComponent = discoveryCheckerComponent;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "world") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/services")
    public List<String> getServiceList() {
        return this.discoveryCheckerComponent.getServiceList();
    }

    @GetMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
        return this.discoveryCheckerComponent.getServiceInstancesByApplicationName(applicationName);
    }
}
