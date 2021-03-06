package com.mnazareno.helloapp.controller;

import com.mnazareno.helloapp.model.Input;
import com.mnazareno.helloapp.model.Output;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${env}")
    private String env;

    @ApiOperation(value = "Get greeting")
    @GetMapping
    public Output hello(Input input) {
        return new Output("Hello " + input.getName(), env);
    }
}
