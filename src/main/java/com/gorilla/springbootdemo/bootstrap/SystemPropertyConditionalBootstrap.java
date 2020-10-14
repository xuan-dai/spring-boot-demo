package com.gorilla.springbootdemo.bootstrap;

import com.gorilla.springbootdemo.annotation.ConditionalOnSystemProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuan
 * @date 2020/10/14
 **/
public class SystemPropertyConditionalBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "Mercy")
    public String helloWorld() {
        return "Hello world";
    }

    public static void main(String[] args) {
        System.setProperty("user.name", "Mercy");
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SystemPropertyConditionalBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean: " + helloWorld);

        context.close();
    }
}
