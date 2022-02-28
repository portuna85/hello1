package com.example.hello.singletone;

import com.example.hello.AppConfig;
import com.example.hello.repositrory.MemberRepository;
import com.example.hello.service.MemberService;
import com.example.hello.service.MemberServiceImpl;
import com.example.hello.service.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {

    @Test
    void configurationTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);

        MemberRepository memberRepository1 = memberService.getMemberRepository();
        MemberRepository memberRepository2 = orderService.getMemberRepository();
        System.out.println("memberRepository1 -> memberRepository = " + memberRepository1);
        System.out.println("memberRepository2 -> memberRepository = " + memberRepository2);
    }
}
