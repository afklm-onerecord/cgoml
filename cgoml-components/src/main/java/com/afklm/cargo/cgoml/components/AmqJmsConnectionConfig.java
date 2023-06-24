package com.afklm.cargo.cgoml.components;

import java.util.Arrays;

import javax.inject.Inject;
import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jms.support.destination.DestinationResolver;
import org.springframework.jms.support.destination.DynamicDestinationResolver;

@Configuration
@Profile("local")
public class AmqJmsConnectionConfig {
	
	@Inject
	private Environment env;
		
	
	@Bean
    public DestinationResolver destinationResolver() {
        DestinationResolver destinationResolver = new DynamicDestinationResolver();
        return destinationResolver;
    }
	
	@Bean
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory result = new ActiveMQConnectionFactory();
		result.setBrokerURL(env.getRequiredProperty("broker.url"));
		result.setTrustedPackages(Arrays.asList("com.afklm"));
		return result;
	}
}