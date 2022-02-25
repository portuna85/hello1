package com.example.hello;

import com.example.hello.discount.FixDiscountPolicy;
import com.example.hello.repositrory.MemberRepository;
import com.example.hello.repositrory.MemoryMemberRepository;
import com.example.hello.service.MemberService;
import com.example.hello.service.MemberServiceImpl;
import com.example.hello.service.OrderService;
import com.example.hello.service.OrderServiceImpl;

public class AppConfig {
    public MemberService memberSerivce() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}