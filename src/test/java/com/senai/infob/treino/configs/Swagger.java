
package com.senai.infob.treino.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "loja belezuras",
        version = "1.0",
        description = "Email para contato: marialuisaalmeidapereira@gmail.com"
    )
)
public class Swagger {

}