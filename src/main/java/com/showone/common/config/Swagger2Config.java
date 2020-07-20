package com.showone.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author HHN
 * @Date 2020/7/20.
 * @Description swagger2配置类
 *          localhost:8080/swagger-ui.html即可访问
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo())//描述该网站的信息
                .select()//查询对外提供的接口都是什么 concumer项目的controller
                .apis(RequestHandlerSelectors.basePackage("com.showone"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("showone服务接口")
                .description("提供了项目的所有接口信息")
                .contact(new Contact("zhj","www.showone.com","851382823@qq.com"))
                .version("1.0 Beta")
                .build();
    }
}
