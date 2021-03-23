package com.howard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: Howard
 * @date: 2021/3/23 18:13
 * @Desc: swagger2配置类
 */

@Configuration
@EnableSwagger2
public class Swagger2 {

    //配置swagger2核心配置 docket
    @Bean
    public Docket creatRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.howard.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                    .title("接口api")
                    .contact(new Contact("howard","https://www.howard.com","howard@howard.com"))
                    .version("1.0.0")
                    .termsOfServiceUrl("https://www.howard.com")
                    .build();
    }
}
