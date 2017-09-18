package com.mnazareno.helloapp.model;

public class Output {

    private String message;

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
