package cn.edu.tongji.tfor_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicserviceCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicserviceCommonApplication.class, args);
    }

}
