package com.example.hello.beanfind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContext {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationContext.class);

    @Test
    @DisplayName("모든 빈 출력")
    void findAll() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {

        }
    }
}
