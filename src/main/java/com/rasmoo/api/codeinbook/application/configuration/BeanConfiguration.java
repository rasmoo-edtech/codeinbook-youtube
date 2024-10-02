package com.rasmoo.api.codeinbook.application.configuration;

import com.rasmoo.api.codeinbook.domain.port.out.AuthorRepositoryPort;
import com.rasmoo.api.codeinbook.domain.service.AuthorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public AuthorService authorService(AuthorRepositoryPort authorRepositoryPort) {
        return new AuthorService((authorRepositoryPort));
    }

}
