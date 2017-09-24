package com.mnazareno.helloapp.model;

import io.swagger.annotations.ApiModelProperty;

public class Input {

    @ApiModelProperty(value = "the name to be greeted")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
