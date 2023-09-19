package com.java.instructor.soap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@Configuration
@ComponentScan("com.javainstructor.spring.config")
@EnableIntegration
@IntegrationComponentScan("com.javainstructor.spring.config")
public class SoapMapperServiceConfiguration {

	@Bean
	public MessageChannel soapErrorChannel() {
		return new DirectChannel();
	}

	@Bean
	public MessageChannel logChannel1() {
		return new DirectChannel();
	}

	@Bean
	public MessageChannel soapInboundRequestChannel() {
		return new DirectChannel();
	}

	@Bean
	public MessageChannel soapResponseParseChannel() {
		return new DirectChannel();
	}
}
