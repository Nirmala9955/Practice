package com.sahu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Proj02CommunicationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj02CommunicationAppApplication.class, args);
	}

}
