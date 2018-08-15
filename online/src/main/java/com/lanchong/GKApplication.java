package com.lanchong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass=true)
//@ComponentScan(basePackages={"com.lanchong.**.service"})
public class GKApplication {
    public static void main(String[] args) {
        SpringApplication.run(GKApplication.class, args);
    }
}
