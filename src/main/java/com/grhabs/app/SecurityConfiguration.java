package com.grhabs.app;

import org.apache.catalina.security.SecurityUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    private static final String LOGIN_PROCESSING_URL = "/login";
    private static final String LOGIN_FAILURE_URL = "/login?error";
    private static final String LOGIN_URL = "/login";
    private static final String LOGOUT_URL = "/login";
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        // No usar Spring CSRF aquí para poder usar HTML sin formato para la página de inicio de sesión
        http.csrf().disable()
                // Registre nuestro CustomRequestCache que guarda los intentos de acceso no autorizados, entonces
                // el usuario es redirigido después de iniciar sesión.
                .requestCache().requestCache(new CustomRequestCache())

                // Restringe el acceso a nuestra aplicación.
                .and().authorizeRequests()

                // Permitir todas las solicitudes internas de flujo.
                .requestMatchers(SecurityUtils::isFrameworkInternalRequest).permitAll()

                // Permitir todas las solicitudes de usuarios registrados.
                .anyRequest().authenticated()

                //Configurando la pagina de inicio
                .and().formLogin().loginPage(LOGIN_URL).permitAll()
                .loginProcessingUrl(LOGIN_PROCESSING_URL)
                .failureUrl(LOGIN_FAILURE_URL)

                //Configurando logout
                .and().logout().logoutSuccessUrl(LOGOUT_URL);
    }
    /**
     * Permite el acceso a recursos estáticos, evitando la seguridad de Spring.
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                // Recursos estáticos de Vaadin Flow //
                "/VAADIN/**",

                // el URI favicon estándar
                "/favicon.ico",

                // el estándar de exclusión de robots
                "/robots.txt",

                // manifiesto de la aplicación web//
                "/manifest.webmanifest",
                "/sw.js",
                "/offline-page.html",

                //(modo de desarrollo) recursos estáticos //
                "/frontend/**",

                // (modo de desarrollo) webjars //
                "/webjars/**",

                //
                //(modo de producción) recursos estáticos //
                "/frontend-es5/**", "/frontend-es6/**");
    }
}
