package com.alejjandrodev.UpdateInventory;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloLambdaFunction implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello, " + input + "!";
    }
}
