package com.danielsacol.soccerfieldmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;

@Configuration
public class CloudinaryConfig {

    @Bean
    Cloudinary Cloudinary(){
        return new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "dcb66jymq",
            "api_key", "344591267371886",
            "api_secret", "rcc1XxWMokqZf8PElnxh62lViGM"
        ));
    }

}
