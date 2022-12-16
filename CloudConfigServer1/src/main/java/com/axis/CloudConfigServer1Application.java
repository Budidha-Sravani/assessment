package com.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class CloudConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServer1Application.class, args);
	}

}
