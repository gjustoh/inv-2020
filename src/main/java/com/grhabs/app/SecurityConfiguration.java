package com.grhabs.app;

import com.grhabs.backend.data.Usuario;
import com.grhabs.backend.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private static final String LOGIN_PROCESSING_URL = "/login";
    private static final String LOGIN_FAILURE_URL = "/login?error";
    private static final String LOGIN_URL = "/login";
    private static final String LOGOUT_URL = "/login";
    private final UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public SecurityConfiguration(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public UsuarioActual usuarioActual(UsuarioService us){
        final String username = SecurityUtils.getusername();
        Usuario user = username !=null? us.getuser(username):
                null;
        return ()->user;

    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
        auth.userDetailsService(userDetailsService)/*.passwordEncoder(passwordEncoder)*/;
    }


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
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()

                //Configurando la pagina de inicio
                .and().formLogin().loginPage(LOGIN_URL).permitAll()
                .loginProcessingUrl(LOGIN_PROCESSING_URL)
                .failureUrl(LOGIN_FAILURE_URL)
//Register the success handler that redirects users to the page they last tried to access
                .successHandler(new SavedRequestAwareAuthenticationSuccessHandler())
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
