package com.java.instructor.spring.soap.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.java.instructor.soap.jaxb.gen.GetCountryRequest;
import com.java.instructor.soap.jaxb.gen.GetCountryResponse;
import com.java.instructor.soap.service.SoapMapperService.AmazeSoapMessageGateway;




@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://www.javainstructor.com/springsoap/gen";

    private CountryRepository countryRepository;
    
	@Autowired
	ApplicationContext context;
	
	@Autowired
	AmazeSoapMessageGateway gateway;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
    	
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        System.out.println("Response "+response);     	
		gateway.sendSoapInboundTrigger(response);
        return response;
    }
    
}
