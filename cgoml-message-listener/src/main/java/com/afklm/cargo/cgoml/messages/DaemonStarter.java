package com.afklm.cargo.cgoml.messages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class DaemonStarter {
	
	public static void main(String[] args) {
        SpringApplication.run(DaemonStarter.class, args);
    }
}
