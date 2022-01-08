package cn.edu.tongji.tfor_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TforbackendAction8085Application {

    public static void main(String[] args) {
        SpringApplication.run(TforbackendAction8085Application.class, args);
    }

}
