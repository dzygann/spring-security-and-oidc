package de.zygann.springsecurityoidc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.YamlPropertySourceLoader;


@SpringBootApplication
public class SpringSecurityOidcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOidcApplication.class, args);

	}

}
