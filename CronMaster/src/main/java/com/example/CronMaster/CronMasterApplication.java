package com.example.CronMaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronMasterApplication.class, args);
	}

}
