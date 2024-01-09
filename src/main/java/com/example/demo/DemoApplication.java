package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        // Configura la zona horaria de la JVM a "America/Bogota"
        TimeZone.setDefault(TimeZone.getTimeZone("America/Bogota"));

        SpringApplication.run(DemoApplication.class, args);
    }
     // esto nos permite consumir  el api sin problemas de cors solo sirve para los get
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:3000").allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
            }
        };
    }

}
