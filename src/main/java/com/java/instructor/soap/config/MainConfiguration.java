
package com.java.instructor.soap.config;

import java.util.Scanner;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.GlobalChannelInterceptor;
import org.springframework.messaging.support.ChannelInterceptor;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)

@Configuration
@ComponentScan({ "com.javainstructor.spring.config", "com.javainstructor.spring.service","com.javainstructor.spring.soap.service" })
@EnableIntegration
@IntegrationComponentScan({ "com.javainstructor.spring.config", "com.javainstructor.spring.service","com.javainstructor.spring.soap.service" })

public class MainConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainConfiguration.class);
	private static Scanner scanner;

	public static void main(final String... args) throws JAXBException {
		ConfigurableApplicationContext context = new SpringApplication(MainConfiguration.class).run(args);
		context.registerShutdownHook();
		exitSignalHandler();
	}

	public static void exitSignalHandler() {
		scanner = new Scanner(System.in);
		while (!scanner.hasNext("q")) {
		}
		System.exit(0);
	}

	@Bean
	@GlobalChannelInterceptor(patterns = { "soapInboundRequestChannel", "soapResponseParseChannel","logChannel1" })
	public ChannelInterceptor aChennalInterceptor() {
		return new AmazeChennalInterceptor();
	}

}
