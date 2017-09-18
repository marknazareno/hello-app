package com.mnazareno.helloapp.controller;

import com.mnazareno.helloapp.model.Input;
import com.mnazareno.helloapp.model.Output;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${env}")
    private String env;

    @GetMapping
    public Output hello(Input input) {
        return new Output("Hello " + input.getName(), env);
    }
}
