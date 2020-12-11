package com.rm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.rm.controller.BaseController;

@Component
public class InterceptorConfig implements WebMvcConfigurer {
  
  @Autowired
  BaseController baseController;

  @Override
  public void addInterceptors(InterceptorRegistry registry)
  {
      registry.addInterceptor(baseController).addPathPatterns("/**").excludePathPatterns("/v2/api-docs", "/configuration/ui", "/swagger-resources/**",
              "/configuration/**", "/swagger-ui.html", "/");
  }}
