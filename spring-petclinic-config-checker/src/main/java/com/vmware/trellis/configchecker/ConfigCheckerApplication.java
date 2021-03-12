package com.vmware.trellis.configchecker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCheckerApplication.class, args);
	}

	@RestController
	static class MessageRestController {

		@Value("${message:Hello default}")
		private String message;

		@GetMapping("/message")
		String getMessage() {
		    log.info("Sending greeting message '{}'", this.message);
			return this.message;
		}
	}
}
