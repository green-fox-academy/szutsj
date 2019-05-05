package com.greenfoxacademy.todoauthwithbuiltinauth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.authorizeRequests()
        .antMatchers("/login","/register").permitAll()
        .anyRequest().authenticated()
    .and()
        .formLogin()
        .successForwardUrl("/protected")
        .failureForwardUrl("/register")
     .and()
        .logout();
  }


  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    // Create a default account
    auth.inMemoryAuthentication().withUser("edit").password(passwordEncoder().encode("edit")).roles("USER");
    auth.inMemoryAuthentication().withUser("judit").password(passwordEncoder().encode("judit")).roles("USER");
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
