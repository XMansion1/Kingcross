package com.xmansion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:keycloakSecurity.xml"})
public class KingcrossApplication {

	public static void main(String[] args) {
		SpringApplication.run(KingcrossApplication.class, args);
	}
}
