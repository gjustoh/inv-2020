package com.grhabs;

import com.grhabs.app.SecurityConfiguration;
import com.grhabs.backend.data.Usuario;
import com.grhabs.backend.services.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication(scanBasePackageClasses = {SecurityConfiguration.class,MainView.class,Application.class, UsuarioService.class},exclude = ErrorMvcAutoConfiguration.class)
@EntityScan(basePackageClasses = {Usuario.class})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
