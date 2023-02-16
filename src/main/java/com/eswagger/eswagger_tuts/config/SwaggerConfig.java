package com.eswagger.eswagger_tuts.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//now we are writing the code to generate the documentation of api
	//for that you need to create docket object for restApi,docket will generate api for which component to 
	//generate the document
	
	@Autowired
	public Docket restApi() {
		
		return new  Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.eswagger.eswagger_tuts.rest"))
				.build();
		
	}
	
}
//     http://localhost:9090/bookFlightTicket
//     http://localhost:9090/swagger-ui.html   for swagger ui
//     http://localhost:9090/v2/api-docs       this url will generate    for swagger documentation  in json format