package com.rm.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class Swagger2Config {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("com.rm")).paths(PathSelectors.regex("/.*"))
        .build()
				/*
				 * .tags(new Tag("Cvent", "Webservice to fetch the data from Cvent")) .tags(new
				 * Tag("SOAP", "Webservice to fetch the data from Cvent SOAP API"))
				 */
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfo("Remind Me Service", "Webservice for Remind Me", "1.0",
        "Terms of service", new Contact("Team Remind Me", "https://my.idp-connect.com", "todoremindme1@gmail.com"),
        "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0",
        Collections.emptyList());
  }

}
