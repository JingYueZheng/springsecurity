package com.jyz.bootproject.configs;


import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.function.Predicate;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jyz.bootproject.modules"))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Swagger实例文档",
                "我的项目",
                "API V1.0",
                "Terms of service",
                new Contact("荆某人", "", "2979532520@qq.com"),
                "Apache", "http://www.apache.org/", Collections.emptyList());
    }

}
