package com.rest.iam.restclientexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IAMRestClient {

    @Autowired
    private RestTemplate restTemplate;


    public IAMRestClient(RestTemplate restTemplate) {
        this.restTemplate= restTemplate;

    }


    public IAMRestResponse getAuthorization(IAMRestClientRequest iamRestClientRequest){
        return new IAMRestResponse();
    }


}
