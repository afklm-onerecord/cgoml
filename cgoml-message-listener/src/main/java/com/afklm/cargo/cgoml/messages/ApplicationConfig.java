package com.afklm.cargo.cgoml.messages;

import javax.inject.Inject;
import javax.jms.ConnectionFactory;
import javax.naming.NamingException;

import org.sklsft.commons.jms.aspect.correlation.JmsContextAspect;
import org.sklsft.commons.jms.aspect.logging.JmsListenerLoggingAspect;
import org.sklsft.commons.log.AccessLogger;
import org.sklsft.commons.log.ErrorLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.destination.DestinationResolver;


@Configuration
@ComponentScan(basePackages = "com.afklm.cargo.cgoml")
@EnableJms
@EnableAspectJAutoProxy
public class ApplicationConfig {

	@Inject
	private Environment env;
 
	@Inject
	private AccessLogger accessLogger;
 
	@Inject
	private ErrorLogger errorLogger;

	/*
	 * ################################ ACCESS AND ERROR LOGGERS START ################################
	 */
	@Bean
	public JmsContextAspect jmsContextAspect() {
		return new JmsContextAspect();
	}

	@Bean
	public JmsListenerLoggingAspect jmsLoggingAspect() {
		JmsListenerLoggingAspect result = new JmsListenerLoggingAspect();
		result.setAccessLogger(accessLogger);
		result.setErrorLogger(errorLogger);
		result.setTraceRequestBody(env.getRequiredProperty("accessLog.traceRequestBody", Boolean.class));
		result.setTraceResponseBody(env.getRequiredProperty("accessLog.traceResponseBody", Boolean.class));
		return result;
	}
	/*
	 * ################################ ACCESS AND ERROR LOGGERS END ################################
	 */

	
	

	/*
	 * ################################ JMS Listners ################################
	 */
	@Inject
	private ConnectionFactory connectionFactory;

	@Inject
	public DestinationResolver destinationResolver;

	@Bean
	public DefaultJmsListenerContainerFactory messageContainerFactory() throws NamingException {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);
		factory.setDestinationResolver(destinationResolver);
		return factory;
	}
}