package com.example.hello.singletone;

import com.example.hello.AppConfig;
import com.example.hello.service.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SingleToneTest {

    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        // 1. 조회 : 호출할 때 마다 객체를 생성
        MemberService memberService1 = appConfig.memberService();

        // 2. 조회 : 호출할 때 마다 객체를 생성
        MemberService memberService2 = appConfig.memberService();

        // 참조 값이 다른 것을 확인
        System.out.println("memberService1 : " + memberService1);
        System.out.println("memberService2 : " + memberService2);

        assertThat(memberService1).isNotSameAs(memberService2);
    }

    public static void main(String[] args) {
        SingletonService.getInstance().logic();
    }

    @Test
    @DisplayName("싱클톤 패턴을 적용한 객체 사용")
    void singletoneServiceTes() {
        SingletonService singtoneService1 = SingletonService.getInstance();
        SingletonService singtoneService2 = SingletonService.getInstance();

        System.out.println("singtoneService1 = " + singtoneService1);
        System.out.println("singtoneService2 = " + singtoneService2);

        assertThat(singtoneService1).isSameAs(singtoneService2);
    }
}
