package com.example.hello.discount;

import com.example.hello.annotation.MainDiscountPolicy;
import com.example.hello.domain.Grade;
import com.example.hello.domain.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}