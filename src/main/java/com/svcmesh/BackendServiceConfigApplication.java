package com.svcmesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope  //sync config from spring cloud config server
public class BackendServiceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendServiceConfigApplication.class, args);
	}

}
