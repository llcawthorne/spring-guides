package com.example.ui.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER - 2)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .httpBasic()
      .and()
      .authorizeRequests()
        .antMatchers("/index.html", "/", "/home", "/login").permitAll()
        .antMatchers("/**/*.js", "**/*.css", "/**/*.map", "/webjars/**").permitAll()
        .anyRequest().authenticated()
      .and().csrf()
        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
  }

}
