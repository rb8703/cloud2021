package com.liwenrui.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2021/6/6
 *
 * @author liwenrui
 */
@Configuration
public class ApplicationContextConfig {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
