package com.example.hello.service;

import com.example.hello.discount.DiscountPolicy;
import com.example.hello.discount.FixDiscountPolicy;
import com.example.hello.discount.RateDiscountPolicy;
import com.example.hello.domain.Member;
import com.example.hello.domain.Order;
import com.example.hello.repositrory.MemberRepository;
import com.example.hello.repositrory.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}