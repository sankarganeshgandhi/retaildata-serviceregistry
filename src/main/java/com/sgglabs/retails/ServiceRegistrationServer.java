package com.sgglabs.retails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Sankarganesh (sankarganesh.gandhi@gmail.com)
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {
    public static void main( String[] args ) {
        // Tell Boot to look for registration-server.yml
        System.setProperty("spring.config.name", "registration-server");
        SpringApplication.run(ServiceRegistrationServer.class, args);
    }
}
