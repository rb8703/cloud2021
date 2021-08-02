package com.liwenrui.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created on 2021/8/1
 *
 * @author liwenrui
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PatmentMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(PatmentMain9003.class,args);
    }
}
