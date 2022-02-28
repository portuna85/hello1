package com.example.hello.service;

import com.example.hello.domain.Member;
import com.example.hello.repositrory.MemberRepository;

public interface MemberService {
    void join(Member member);

    Member findMember(Long MemberId);

    MemberRepository getMemberRepository();
}
