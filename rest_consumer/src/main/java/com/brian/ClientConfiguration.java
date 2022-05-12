package com.brian;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.brian.services.OrderService;

@Configuration
public class ClientConfiguration {
	
	/*
	 * this bean is how soap service talks to this rest consumer service
	 */
	@Bean
	public JaxWsPortProxyFactoryBean serviceProxy() {
		JaxWsPortProxyFactoryBean proxyFactory = new JaxWsPortProxyFactoryBean();
		
		try {
			proxyFactory.setWsdlDocumentUrl(new URL("http://localhost:8002/soap-service/order-service?wsdl"));
			proxyFactory.setServiceInterface(OrderService.class);
			
			proxyFactory.setServiceName("OrderServiceImplService");
			proxyFactory.setPortName("OrderServiceImplPort");
			proxyFactory.setNamespaceUri("http://services.brian.com/");
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		return proxyFactory;
	}
	
	
	
	


}