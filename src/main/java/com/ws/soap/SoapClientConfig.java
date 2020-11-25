package com.ws.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.ws.soap.wsdl");
		return marshaller;
	}
	  @Bean
	  public SoapClient add(Jaxb2Marshaller marshaller) {
	    SoapClient client = new SoapClient();
	    client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
	    return client;
	  }
}