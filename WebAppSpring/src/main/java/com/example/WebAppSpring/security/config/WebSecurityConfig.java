package com.example.WebAppSpring.security.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;




@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig implements WebSecurityConfigurer {


    @Override
    public void init(SecurityBuilder builder) throws Exception {
        
    }

    @Override
    public void configure(SecurityBuilder builder) throws Exception {

    }
}
