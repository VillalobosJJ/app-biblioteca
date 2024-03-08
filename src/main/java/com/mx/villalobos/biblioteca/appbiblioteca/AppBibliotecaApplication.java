package com.mx.villalobos.biblioteca.appbiblioteca;



import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication

public class AppBibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBibliotecaApplication.class, args);
	}
	
	@Bean
	public OpenAPI info() {
		return new OpenAPI()
				.info(new Info().title("La wiki existe")
				.description("Aquí sí hay documentación")
				.version("v69")
				.contact(new Contact()
						.email("javier.juarez@aforecoppel.com")));
	}

}
