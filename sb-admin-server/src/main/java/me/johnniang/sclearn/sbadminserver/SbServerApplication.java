package me.johnniang.sclearn.sbadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SbServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbServerApplication.class, args);
    }

}
