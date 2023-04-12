package org.example.config;
import org.example.demo.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
    @Bean
    @Scope("singleton")
    public Customer customerSingleton(){
        return new Customer();
    }
}
