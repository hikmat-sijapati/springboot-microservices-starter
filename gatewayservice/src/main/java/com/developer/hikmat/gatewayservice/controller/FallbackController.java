package com.developer.hikmat.gatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/auth")
    public String authServiceFallback(){
        return "This is a fallback for auth service.";
    }

    @GetMapping("/api")
    public String apiServiceFallback(){
        return "This is a fallback for api service";
    }
}