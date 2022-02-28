package com.example.hello;

import com.example.hello.discount.DiscountPolicy;
import com.example.hello.discount.RateDiscountPolicy;
import com.example.hello.repositrory.MemoryMemberRepository;
import com.example.hello.service.MemberService;
import com.example.hello.service.MemberServiceImpl;
import com.example.hello.service.OrderService;
import com.example.hello.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // @Bean memberSerivcie -> new MemoryMemberRepository()
    // @Bean orderService -> new MemoryMemberRepository()
    // call AppConfig.memberService
    // call AppConfig.memberRepository
    // call AppConfig.memberRepository
    // call AppConfig.orderService
    // call AppConfig.memberRepository

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        // return new OrderServiceImpl(memberRepository(), discountPolicy());
        return null;
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}