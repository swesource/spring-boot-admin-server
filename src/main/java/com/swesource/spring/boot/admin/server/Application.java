package com.swesource.spring.boot.admin.server;

import de.codecentric.boot.admin.server.config.AdminServerHazelcastAutoConfiguration;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Application { //(exclude = AdminServerHazelcastAutoConfiguration.class) {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
