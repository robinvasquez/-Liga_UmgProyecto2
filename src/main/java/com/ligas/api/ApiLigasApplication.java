package com.ligas.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
 
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class ApiLigasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLigasApplication.class, args);
	}

}
