package com.ws.soap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.ws.request.AddRequest;
import com.ws.soap.wsdl.Add;
import com.ws.soap.wsdl.AddResponse;

public class SoapClient extends WebServiceGatewaySupport{
	
	private final static Logger LOG = LoggerFactory.getLogger(SoapClient.class);	
	
	public AddResponse addResponse(AddRequest suma) {
		Add request = new Add();
		request.setIntA(suma.getIntA());
		request.setIntB(suma.getIntB());
		AddResponse response = (AddResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", request,
						new SoapActionCallback("http://tempuri.org/Add"));
		LOG.info(response.getAddResult() + "");
		return response;
	}
}