package com.examples.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "WsAnnotationWebServiceI", portName = "WsAnnotationWebServicePort", 
			endpointInterface ="com.examples.webservice.WsAnnotationWebServiceI", targetNamespace = "urn:WsAnnotationWebServiceI",
			wsdlLocation = "WsAnnotationWebServiceI.wsdl")
public class WsAnnotationWebServiceImpl implements WsAnnotationWebServiceI {

	@Override
	public float celsiusToFarenheit(float celsius) {
		return ((celsius - 32) * 5)/9;
	}
	
}
