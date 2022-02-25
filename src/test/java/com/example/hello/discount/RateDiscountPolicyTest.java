package com.example.hello.discount;

import com.example.hello.domain.Grade;
import com.example.hello.domain.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10%할인이 되어야 한다.")
    void vip_o() {
        // given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        // when
        int discount = discountPolicy.discount(member,10000);
        // Then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 적용 ㄴㄴ")
    void vip_x() {
        // given
        Member member = new Member(2L, "memberVIP", Grade.BASIC);
        // when
        int discount = discountPolicy.discount(member, 10000);
        // Then
        assertThat(discount).isEqualTo(1000);
    }
}