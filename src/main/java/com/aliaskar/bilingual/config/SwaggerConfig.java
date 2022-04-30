package com.aliaskar.bilingual.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Admin on 30.04.2022
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI bilingual(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Bilingual application for frontend")
                                .version("1.0.0")
                                .contact(new Contact()
                                        .name("Aliaskar")
                                )


                );
    }

}
