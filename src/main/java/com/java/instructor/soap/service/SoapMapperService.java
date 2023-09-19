package com.java.instructor.soap.service;

import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.handler.LoggingHandler;
import org.springframework.integration.handler.LoggingHandler.Level;
import org.springframework.integration.xml.transformer.MarshallingTransformer;
import org.springframework.integration.xml.transformer.ResultToStringTransformer;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.java.instructor.soap.jaxb.gen.GetCountryResponse;


@Configuration
@ComponentScan({ "com.java.instructor.soap.service", "com.java.instructor.soap.config" })
@EnableIntegration
@IntegrationComponentScan({ "com.java.instructor.soap.service", "com.java.instructor.soap.config" })
public class SoapMapperService extends WebServiceGatewaySupport{

	private final Logger log = LoggerFactory.getLogger(SoapMapperService.class);


	@MessagingGateway(defaultRequestTimeout = "5000", defaultReplyTimeout = "5000")
	public interface AmazeSoapMessageGateway {
		@Gateway(requestChannel = "soapInboundRequestChannel")
		public void sendSoapInboundTrigger(GetCountryResponse data);
	}
	
		
	@Bean
	@Transformer(inputChannel = "soapInboundRequestChannel", outputChannel = "soapResponseParseChannel")
	public MarshallingTransformer marshallingTransformer() {
		try {
			return new MarshallingTransformer(marshaller());
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	@Bean
	@Transformer(inputChannel = "soapResponseParseChannel", outputChannel = "logChannel1")
	public ResultToStringTransformer respsonseResultTransfomer() {
		return new ResultToStringTransformer();
	}

	
    @Bean
    public Jaxb2Marshaller marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("com.javainstructor.jaxb.gen");
            return marshaller;
    }		


	
	@Bean
	@ServiceActivator(inputChannel = "logChannel1")
	public LoggingHandler logging1() {
		LoggingHandler adapter = new LoggingHandler(Level.DEBUG);
		adapter.setLoggerName("LogHandler1");
		adapter.setLogExpressionString("'log msg: ' + payload");		
		return adapter;
	}

}
