package com.lanchong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.lanchong"})
//@EnableJpaRepositories(basePackages = "com.lanchong")
@EnableJpaRepositories
public class GKApplication {
    public static void main(String[] args) {
        SpringApplication.run(GKApplication.class, args);
    }
}
