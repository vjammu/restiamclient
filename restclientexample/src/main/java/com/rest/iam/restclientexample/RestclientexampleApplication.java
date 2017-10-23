package com.rest.iam.restclientexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

@ComponentScan("com.rest.iam.restclientexample")
@SpringBootApplication
public class RestclientexampleApplication {


	@Autowired
	private static IAMRestClient iamRestClient;

	public static void main(String[] args) {


		org.springframework.context.ConfigurableApplicationContext context=
		SpringApplication.run(RestclientexampleApplication.class, args);


  IAMRestClient iamRestClient= new IAMRestClient(context.getBean(RestTemplate.class));


		IAMRestClientRequest iamRestClientRequest= new IAMRestClientRequest();


		IAMRestResponse iamRestResponse=   iamRestClient.getAuthorization(iamRestClientRequest);


	}
}
