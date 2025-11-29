package com.study.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
        	@Override
        	public void addCorsMappings(CorsRegistry registry) {
        	    registry.addMapping("/**")
        	            .allowedOriginPatterns("http://localhost:3000", "http://192.168.50.56:3000")
        	            .allowedMethods("*")
        	            .allowCredentials(true);
        	}

        };
    }
}
