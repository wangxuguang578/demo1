package com.wxg.demo.config;

import io.swagger.annotations.ApiImplicitParams;
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

@Configuration
@EnableSwagger2
public class Swagger2Config{

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //扫描路径
//              .apis(RequestHandlerSelectors.basePackage("cn.wolfcode.controller"))
                //根据注解定制
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiImplicitParams.class))
                //定义哪些路径的接口需要生成文档
                .paths(PathSelectors.any())
                .build();
    }
    @Bean
    public ApiInfo apiInfo() {
        Contact contact = new Contact("sky","https://www.jianshu.com/u/a099a2677722","8888@126.com");
        return new ApiInfoBuilder()
                //文档首页标题
                .title("Spring Boot中使用Swagger2构建RESTful API")
                //文档描述信息
                .description("swagger2-文档构建利器")
                //创建者信息
                .contact(contact)
                //文档版本
                .version("1.0")
                .build();
    }
}