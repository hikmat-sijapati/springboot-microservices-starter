package com.developer.hikmat.authservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    /**
     * Default Index Function
     * @return
     */
    @RequestMapping(value = "/auth",method = RequestMethod.GET)
    public String index() {
        return "Hello From Auth Service";
    }
}
