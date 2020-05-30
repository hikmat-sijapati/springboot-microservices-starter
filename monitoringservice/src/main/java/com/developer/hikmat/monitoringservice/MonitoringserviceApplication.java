package com.developer.hikmat.monitoringservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MonitoringserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringserviceApplication.class, args);
    }

}
