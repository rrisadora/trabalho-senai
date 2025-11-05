package com.senai.infoa.trabalhosenai.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Filmes",
        version = "1.0",
        description = "Entretenimento para a galera"
    )
)
public class Swagger {

}