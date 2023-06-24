package com.afklm.cargo.cgoml.populator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.afklm.cargo.cgoml", "org.sklsft.generator"})
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
}