package com.gorilla.springbootdemo.annotation;

import com.gorilla.springbootdemo.condition.OnSystemPropertyCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author xuan
 * @date 2020/10/14
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    String name();

    String value();
}
