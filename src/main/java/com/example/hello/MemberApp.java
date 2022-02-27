package com.example.hello;

import com.example.hello.domain.Grade;
import com.example.hello.domain.Member;
import com.example.hello.service.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberSerivce();
        // MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "JSBAE", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println(member.getName());
        System.out.println(findMember.getName());

    }
}