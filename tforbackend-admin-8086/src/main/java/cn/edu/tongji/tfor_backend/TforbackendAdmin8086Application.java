package cn.edu.tongji.tfor_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TforbackendAdmin8086Application {

    public static void main(String[] args) {
        SpringApplication.run(TforbackendAdmin8086Application.class, args);
    }

}
