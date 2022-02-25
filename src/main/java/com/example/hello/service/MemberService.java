package com.example.hello.service;

import com.example.hello.domain.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long MemberId);
}
