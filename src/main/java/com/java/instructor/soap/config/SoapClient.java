package com.java.instructor.soap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.javainstructor.jaxb.gen.GetCountryResponse;

@Configuration
public class SoapClient {
	
	@Bean
    public Jaxb2Marshaller soapMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();	
        marshaller.setContextPath("com.java.instructor.jaxb.gen");
        return marshaller;
    }	 
    @Bean
    public SOAPConnector soapConnector() {
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://localhost:8082/ws");
        client.setMarshaller(soapMarshaller());
        client.setUnmarshaller(soapMarshaller());
        return client;
    }
    

    @Autowired
    SOAPConnector SOAPclient;  	    
    
    
    @Transformer(inputChannel = "SoapOutboundChannel", outputChannel = "SoapOutboundLogChannel")
	public Message<?> soapOutboundChannelTransformer(final Message inputMessage) {
    	System.out.println("Soap Request ----->");
		System.out.println(inputMessage.getPayload());			
		try {
			 String country = "Spain";
			 GetCountryResponse response = SOAPclient.getCountry(country);		   
		    System.out.println("Soap response ----->"+response);
		    final Message<String> message = MessageBuilder.withPayload(response.getCountry().getCurrency().name()).copyHeaders(inputMessage.getHeaders()).build();
			return message;
		} catch (Exception e) {
			System.out.println(e);
		}
		return inputMessage;
	}
}
