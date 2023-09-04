package org.vaadin.multimodule.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Vaadin backend Rest App", description = "description"))
public class BackendApp {
    public static void main(String[] args) {
        SpringApplication.run(BackendApp.class);
    }
}