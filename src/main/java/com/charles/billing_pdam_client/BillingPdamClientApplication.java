package com.charles.billing_pdam_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BillingPdamClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingPdamClientApplication.class, args);
	}

}
