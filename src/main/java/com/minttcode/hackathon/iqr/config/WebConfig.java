package com.minttcode.hackathon.iqr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.minttcode.hackathon.iqr"})
public class WebConfig implements WebMvcConfigurer {





}


