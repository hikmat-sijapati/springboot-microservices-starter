package com.developer.hikmat.gatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/**")
                        .filters(f -> f.rewritePath("/api/(?<remains>.*)", "/${remains}")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/api")))
                        .uri("lb://apiservice")
                        .id("apiservice"))

                .route(r -> r.path("/auth/**")
                        .filters(f -> f.rewritePath("/auth/(?<remains>.*)", "/${remains}")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/auth")))
                        .uri("lb://authservice")
                        .id("authservice"))
                .build();
    }

}