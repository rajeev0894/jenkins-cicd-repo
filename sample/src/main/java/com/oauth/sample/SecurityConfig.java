//package com.oauth.sample;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
//	
//	@Bean
//	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
//		http.csrf(AbstractHttpConfigurer::disable)
//		.authorizeHttpRequests(authorizeRequests ->authorizeRequests.anyRequest().authenticated())
//		//.formLogin(form ->form.defaultSuccessUrl("/hello",true));//it tells spring security,after successful authenticating (using form login,url-http://localhost:8080/login),take flow to /hello api .
//		.oauth2Login(oauth2 ->
//		oauth2.defaultSuccessUrl("/hello",true));//it tells spring security,after successful authenticating using oauth2 login(http://localhost:8080/login) ,take flow to /hello api and hit it.
//		return http.build();
//	}
//
//}
