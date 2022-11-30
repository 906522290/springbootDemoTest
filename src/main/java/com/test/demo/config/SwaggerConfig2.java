package com.test.demo.config;


import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

//@Configuration
//@EnableSwagger2 // 开启了 Swagger2
//@EnableSwaggerBootstrapUI
public class SwaggerConfig2 {

//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .enable(true)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.test.demo.controller"))
//                .build();
//    }
//
//    // 配置swagger 信息  apiInfo
//    private ApiInfo apiInfo(){
//        // 作者信息
//        Contact contact = new Contact("", "", "");
//        return new ApiInfo(
//                "宁夏云主站 Api 接口文档",
//                "宁夏云主站后端接口文档",
//                "1.0",
//                "",
//                contact,
//                "Apache 2.0",
//                "http://www.apache.org/licenses/LICENSE-2.0",
//                new ArrayList());
//    }
}