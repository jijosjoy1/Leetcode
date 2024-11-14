package com.codingShuttle.prodready.WFH.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS requests from localhost:8080 (frontend and backend are on the same port)
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:8080")  // Ensure that your frontend is on this domain/port
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);  // Allow cookies and credentials if necessary
    }
}
