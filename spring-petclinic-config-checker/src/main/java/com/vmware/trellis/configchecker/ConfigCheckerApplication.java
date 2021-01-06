package com.vmware.trellis.configchecker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigCheckerApplication {



	public static void main(String[] args) {
		SpringApplication.run(ConfigCheckerApplication.class, args);
	}


	@RefreshScope
	@RestController
	class MessageRestController {

		@Value("${message:Hello default}")
		private String message;

		@GetMapping("/message")
		String getMessage() {
		    log.info("Sending greeting message '{}'", this.message);
			return this.message;
		}


	}

	@RefreshScope
	@Component
	class ScheduledMessageLogger{

		@Value("${message:Hello default}")
		private String message;

		@Scheduled(fixedRate = 30000)
		void logMessage(){
			log.info("Configuration greeting message is set to: {}", message);
		}
	}

}
