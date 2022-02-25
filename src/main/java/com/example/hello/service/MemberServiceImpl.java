package com.example.hello.service;

import com.example.hello.domain.Member;
import com.example.hello.repositrory.MemberRepository;
import com.example.hello.repositrory.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
