package org.springframework.samples.petclinic.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NativeConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class, args);
    }

}
