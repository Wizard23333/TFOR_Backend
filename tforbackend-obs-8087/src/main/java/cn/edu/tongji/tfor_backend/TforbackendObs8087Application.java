package cn.edu.tongji.tfor_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TforbackendObs8087Application {

    public static void main(String[] args) {
        SpringApplication.run(TforbackendObs8087Application.class, args);
    }

}
