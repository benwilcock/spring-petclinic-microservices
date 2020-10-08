package com.vmware.trellis.discoverychecker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DiscoveryCheckerWeb {

    private DiscoveryCheckerComponent discoveryCheckerComponent;

    @Autowired
    public DiscoveryCheckerWeb(DiscoveryCheckerComponent discoveryCheckerComponent) {
        this.discoveryCheckerComponent = discoveryCheckerComponent;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/listservices")
    public String listServices(Model model) {
        List<String> serviceIds = this.discoveryCheckerComponent.getServiceList();
        model.addAttribute("servicelist", serviceIds);
        return "listservices";
    }
}
