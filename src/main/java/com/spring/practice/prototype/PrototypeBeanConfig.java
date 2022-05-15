package com.spring.practice.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeBeanConfig {
    
    @Bean
    @Scope("prototype")
    public TestInterface testInterface() {
        return new Test();
    }
}
