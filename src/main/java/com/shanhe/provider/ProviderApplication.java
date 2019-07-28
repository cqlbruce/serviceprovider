package com.shanhe.provider;

import com.shanhe.provider.aop.TestCglib;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args){
        TestCglib.testCGlib();
        SpringApplication.run(ProviderApplication.class,args);
    }

}
