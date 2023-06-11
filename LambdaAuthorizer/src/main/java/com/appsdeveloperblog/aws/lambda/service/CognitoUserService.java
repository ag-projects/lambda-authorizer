package com.appsdeveloperblog.aws.lambda.service;


import com.google.gson.JsonObject;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.cognitoidentityprovider.CognitoIdentityProviderClient;
import software.amazon.awssdk.services.cognitoidentityprovider.model.AdminGetUserRequest;


public class CognitoUserService {

    // private final CognitoIdentityProviderClient cognitoIdentityProviderClient;

    public CognitoUserService(String region) {
        // FIXME builder fails here
//        this.cognitoIdentityProviderClient = CognitoIdentityProviderClient.builder()
//                .region(Region.of(region))
//                .build();
    }

    public JsonObject getUserByUserName(String userName, String poolId) {
        JsonObject jsonObject = new JsonObject();

        AdminGetUserRequest adminGetUserRequest = (AdminGetUserRequest) AdminGetUserRequest.builder()
                .username(userName)
                .userPoolId(poolId)
                .build();

        return jsonObject;
    }
}
