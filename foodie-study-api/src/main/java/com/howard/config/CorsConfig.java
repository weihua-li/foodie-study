package com.howard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


/**
 * @author: Howard
 * @date: 2021/3/23 16:13
 * @Decs
 */

@Configuration
public class CorsConfig {

    public CorsConfig(){
    }

    @Bean
    public CorsFilter corsFilter(){
        //1、添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://127.0.0.1:8848");

        //设置是否发送cookie信息
        config.setAllowCredentials(true);

        //设置允许的请求方式
        config.addAllowedMethod("*");

        //设置允许的header
        config.addAllowedHeader("*");

        //2、为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**",config);


        //3、返回重新定义好的corsSource
        return new CorsFilter(corsSource);
    }
}
