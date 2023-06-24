package com.afklm.cargo.cgoml.rest.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class, scanBasePackages = "com.afklm.cargo.cgoml")
public class ApplicationStarter extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}