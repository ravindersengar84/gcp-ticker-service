package com.publisap.stockStats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@PropertySource({
    "classpath:application.properties",
    "classpath:master-application.properties"
})
@ComponentScan(basePackages = "com.publisap")
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

