package com.gorilla.springbootdemo.bootstrap;

import com.gorilla.springbootdemo.annotation.ConditionalOnSystemProperty;
import com.gorilla.springbootdemo.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author xuan
 * @date 2020/10/14
 **/
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        System.setProperty("user.name", "Mercy");
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean: " + helloWorld);

        context.close();
    }
}
