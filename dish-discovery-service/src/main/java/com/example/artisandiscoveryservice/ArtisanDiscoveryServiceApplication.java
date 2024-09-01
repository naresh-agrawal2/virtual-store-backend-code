package com.example.artisandiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ArtisanDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtisanDiscoveryServiceApplication.class, args);
	}

}
