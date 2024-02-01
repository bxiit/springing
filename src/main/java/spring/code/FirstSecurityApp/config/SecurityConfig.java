package spring.code.FirstSecurityApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import spring.code.FirstSecurityApp.security.AuthProviderImpl;

@EnableWebSecurity
public class SecurityConfig {

    private final AuthProviderImpl authProvider;

//    @Autowired
    public SecurityConfig(AuthProviderImpl authProvider) {
        this.authProvider = authProvider;
    }

    // configures authentication
    protected void configure(AuthenticationManagerBuilder managerBuilder) {
        managerBuilder.authenticationProvider(authProvider);
    }
}
