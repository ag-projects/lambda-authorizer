package com.appsdeveloperblog.aws.lambda.authorizer;


import java.util.Arrays;

public class AwsPolicyProvider {

    public PolicyDocument getPolicyDocument(String action, String effect, String resourceArn) {
        Statement statement = Statement.builder()
                .action(action) // "execute-api:Invoke"
                .effect(effect)
                .resource(resourceArn)
                .build();

        PolicyDocument policyDocument = PolicyDocument.builder()
                .version("2012-10-17")
                .statements(Arrays.asList(statement))
                .build();

        return policyDocument;
    }

}
