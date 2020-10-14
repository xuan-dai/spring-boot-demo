package com.gorilla.springbootdemo.annotation;

import com.gorilla.springbootdemo.selector.HelloWorldImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author xuan
 * @date 2020/10/14
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
