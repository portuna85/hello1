package com.example.hello.repositrory;

import com.example.hello.domain.Member;

public interface MemberRepository {
    public void save(Member member);
    public Member findById(Long memberId);
}
