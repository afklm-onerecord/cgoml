package com.afklm.cargo.cgoml.messages;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jndi.JndiTemplate;

@Configuration
@Profile("local")
public class AmqJndiConfig {
	
	@Bean
	public JndiTemplate jndiTemplate(Environment env) {
		JndiTemplate result = new JndiTemplate();
		Properties environment = new Properties();
		environment.put("java.naming.factory.initial", "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		environment.put("connectionFactoryNames", "jms/amq");
		environment.put("connection.jms/amq.brokerURL", env.getRequiredProperty("broker.url"));
		
		result.setEnvironment(environment);
		
		return result;
	}
}