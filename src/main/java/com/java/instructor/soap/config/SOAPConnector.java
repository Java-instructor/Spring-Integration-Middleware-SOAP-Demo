package com.java.instructor.soap.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.javainstructor.jaxb.gen.GetCountryRequest;
import com.javainstructor.jaxb.gen.GetCountryResponse;

public class SOAPConnector extends WebServiceGatewaySupport {
 

    
    private static final Logger logger = LoggerFactory.getLogger(SOAPConnector.class);

    public GetCountryResponse getCountry(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        logger.info( " Requesting information for " + country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }

}