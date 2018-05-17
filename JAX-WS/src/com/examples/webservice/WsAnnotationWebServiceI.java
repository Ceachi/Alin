package com.examples.webservice;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name = "WsAnnotationWebServiceI", targetNamespace = "urn:WsAnnotationWebServiceI")
//@SOAPBinding(style = Style.RPC)
public interface WsAnnotationWebServiceI {
	@WebMethod
	//@WebResult(partName = "farhenheitResponse")
	float celsiusToFarenheit(float celsius);

}
