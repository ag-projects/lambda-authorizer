package com.appsdeveloperblog.aws.lambda.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import software.amazon.awssdk.services.cognitoidentityprovider.model.AdminGetUserRequest;

public class CognitoUserService {

    public JSONPObject getUserByUserName(String userName, String poolId) {

        AdminGetUserRequest adminGetUserRequest = AdminGetUserRequest.builder()
                .username(userName)
                .userPoolId(poolId)
                .build();
        return null;
    }
}
