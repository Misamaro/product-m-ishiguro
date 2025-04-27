package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	// Spring Securityの参考にしたURL
	// https://zenn.dev/kktworks/books/spring_security_6_sample_book/viewer/ss6s_4

	@Bean
	  PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	  
	  @Bean
	  InMemoryUserDetailsManager userDetailsService() {
	    UserDetails admin = User
	        .withUsername("admin")
	        .password(passwordEncoder().encode("admin1234"))
	        .roles("ADMIN")
	        .build();
	    UserDetails student = User
	        .withUsername("test")
	        .password(passwordEncoder().encode("test1234"))
	        .roles("USER")
	        .build();
	    return new InMemoryUserDetailsManager(admin, student);
	  }


  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.formLogin(login -> login //  フォーム認証を使う
        .permitAll()) //  フォーム認証画面は認証不要
        .authorizeHttpRequests(authz -> authz
        .anyRequest().permitAll()  //全てのページをログイン不要にする
        );

    return http.build();
  }
}