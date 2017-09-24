package com.mnazareno.helloapp.model;

import io.swagger.annotations.ApiModelProperty;

public class Output {

    @ApiModelProperty(value = "the greeting message")
    private String message;

    @ApiModelProperty(value = "the environment where the application is installed")
    private String env;

    public Output(String message, String env) {
        this.message = message;
        this.env = env;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
