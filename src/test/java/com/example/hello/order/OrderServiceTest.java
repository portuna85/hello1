package com.example.hello.order;

import com.example.hello.domain.Grade;
import com.example.hello.domain.Member;
import com.example.hello.domain.Order;
import com.example.hello.service.MemberService;
import com.example.hello.service.MemberServiceImpl;
import com.example.hello.service.OrderService;
import com.example.hello.service.OrderServiceImpl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "memberA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
