package com.rogers.ivril.caller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rogers.ivril")
@OpenAPIDefinition(
        info = @Info(
                title = "${application.title}",
                version = "${application.version}",
                termsOfService = "https://rogers.com/terms-of-use",
                description = "${application.description}",
                contact = @Contact(
                        name = "Rogers",
                        url = "https://www.rogers.com",
                        email = "Rssivrintegrationlayer@rci.rogers.com>"
                ),
                license = @License(
                        name = "License",
                        url = "All rights reserved"
                )
        )
)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
