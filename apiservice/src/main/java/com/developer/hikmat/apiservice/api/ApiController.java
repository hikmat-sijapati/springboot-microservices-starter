package com.developer.hikmat.apiservice.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    /**
     * Default Index Function
     * @return
     */
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String index() {
        return "Hello from API Service";
    }
}
