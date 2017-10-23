package com.rest.iam.restclientexample;

import lombok.Data;

@Data
public class IAMRestClientRequest {
    public String username;
    public String password;
    public String headerAuthorizationString;
    public String headerContentType;



}
