package com.example.hello.discount;

import com.example.hello.domain.Grade;
import com.example.hello.domain.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member mbmber, int price) {
        if (mbmber.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}