package com.gorilla.springbootdemo.configure;

import com.gorilla.springbootdemo.annotation.ConditionalOnSystemProperty;
import com.gorilla.springbootdemo.annotation.EnableHelloWorld;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuan
 * @date 2020/10/14
 **/
@Configuration  // Spring 模式装配注解
@EnableHelloWorld // Spring 模块装配注解
// @Import(HelloWorldConfiguration.class)
@ConditionalOnSystemProperty(name = "user.name", value = "Mercy") // Spring 条件装配注解
public class HelloWorldAutoConfiguration {
}
