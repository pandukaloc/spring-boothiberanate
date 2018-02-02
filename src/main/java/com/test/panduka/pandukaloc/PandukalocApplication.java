package com.test.panduka.pandukaloc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PandukalocApplication {

	public static void main(String[] args) {
		SpringApplication.run(PandukalocApplication.class, args);
	}
}
