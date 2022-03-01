package com.example.hello;

import com.example.hello.domain.Grade;
import com.example.hello.domain.Member;
import com.example.hello.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        /*AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberSerivce();
        MemberService memberService = new MemberServiceImpl();
        */

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberSerivce", MemberService.class);

        Member member = new Member(1L, "JSBAE", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println(member.getName());
        System.out.println(findMember.getName());

    }
}