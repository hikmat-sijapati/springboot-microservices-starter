package com.developer.hikmat.sharedservice.service;
import org.springframework.stereotype.Service;

@Service
public class SharedService {
    private String name = "Shared Service Testing";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
