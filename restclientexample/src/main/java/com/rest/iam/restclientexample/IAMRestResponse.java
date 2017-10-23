package com.rest.iam.restclientexample;

import lombok.Data;

@Data
public class IAMRestResponse {
    public String scope;
    public String refresh_token;
    public String expires_in;
    public String access_token;
    public String token_type;




  /*  "scope": "tdr.contract tdr.dataitem",
            "refresh_token": "6c400ba7-d6b1-4c1a-a262-2fd7070242ea",
            "expires_in": "1799",
            "access_token": "5b6451ff-43da-4206-9e48-a60d0b394cd8",
            "token_type": "Bearer"*/

}
