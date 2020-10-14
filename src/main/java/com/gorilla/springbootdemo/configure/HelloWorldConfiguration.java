package com.gorilla.springbootdemo.configure;

import org.springframework.context.annotation.Bean;

/**
 * @author xuan
 * @date 2020/10/14
 **/
public class HelloWorldConfiguration {

    @Bean
    // 方法名即 Bean 名称
    public String helloWorld() {
        return "Hello,World 2020";
    }
}
