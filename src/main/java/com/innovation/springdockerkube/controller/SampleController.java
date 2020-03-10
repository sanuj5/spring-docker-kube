package com.innovation.springdockerkube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hi")
    public String message(){
        return "hi from kubernetes";
    }
}
