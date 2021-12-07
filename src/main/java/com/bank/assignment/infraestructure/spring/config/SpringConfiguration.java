package com.bank.assignment.infraestructure.spring.config;

import com.bank.assignment.application.model.AssignmentRepository;
import com.bank.assignment.infraestructure.repository.AssignmentCrudRepository;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@Configuration
public class SpringConfiguration {

    //Assignment
    @Bean
    public AssignmentRepository repository() {
    return new AssignmentCrudRepository();
    }

}
