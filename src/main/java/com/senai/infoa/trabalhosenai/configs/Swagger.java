package com.senai.infoa.trabalhosenai.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Filmes",
        version = "1.0",
        description = "Participantes: Gabriela Werneck, Gabrielle Gomes, Isadora Rodrigues e Maria Laura Santos - 2° Info A"
    )
)
public class Swagger {

}