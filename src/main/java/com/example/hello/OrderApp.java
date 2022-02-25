package com.example.hello;

import com.example.hello.domain.Grade;
import com.example.hello.domain.Member;
import com.example.hello.domain.Order;
import com.example.hello.service.MemberService;
import com.example.hello.service.MemberServiceImpl;
import com.example.hello.service.OrderService;
import com.example.hello.service.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService =appConfig.memberSerivce();
        OrderService orderService = appConfig.orderService();

        // MemberService memberService = new MemberServiceImpl();
        // OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;

        Member member = new Member(memberId, "JSBAE", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "ItemA", 10000);

        System.out.println("Order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}