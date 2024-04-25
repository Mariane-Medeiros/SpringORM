package com.telusko.springmvc.teste;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Teste {

	public static void main(String[] args) {
		SpringApplication.run(Teste.class, args);
	}
	public class ServletInitializer extends SpringBootServletInitializer {

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringBootApplication.class);
	    }

	}
}