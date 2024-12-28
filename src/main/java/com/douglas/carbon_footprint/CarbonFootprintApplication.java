package com.douglas.carbon_footprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarbonFootprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarbonFootprintApplication.class, args);
	}
}
