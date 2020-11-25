package com.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ws.request.AddRequest;
import com.ws.response.ResponseAdd;
import com.ws.soap.SoapClient;
import com.ws.soap.wsdl.AddResponse;

@RestController
public class ControllerRest {
	
	@Autowired
	SoapClient soapclient;
	
	@PostMapping("/operation/Add")
	public ResponseAdd resultado(@RequestBody AddRequest suma) {
		AddResponse responseSoap = soapclient.addResponse(suma);
		ResponseAdd responseService = new ResponseAdd();
		responseService.setResult(responseSoap.getAddResult());
		return responseService;
	}
}