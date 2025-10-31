package com.ecommerce.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger/OpenAPI Configuration for ShopSphere API Documentation.
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI shopSphereOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("ShopSphere API")
                        .description("REST API for ShopSphere - Your Shopping Universe. " +
                                "Comprehensive e-commerce platform with product management, " +
                                "shopping cart, orders, and user management.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("ShopSphere Team")
                                .email("support@shopsphere.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}
