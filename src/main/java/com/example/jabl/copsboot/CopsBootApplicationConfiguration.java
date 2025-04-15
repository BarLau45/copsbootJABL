package com.example.jabl.copsboot;

import com.example.jabl.orm.jpa.InMemoryUniqueIdGenerator;
import com.example.jabl.orm.jpa.UniqueIdGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class CopsBootApplicationConfiguration {
    @Bean
    public UniqueIdGenerator<UUID> uniqueIdGenerator() {
        return new InMemoryUniqueIdGenerator();
    }
}
