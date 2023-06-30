package com.example.management.member;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl  implements  MemberService{

    MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public long join(Member member) {

        return memberRepository.save(member);
    }

    @Override
    public Member findByMember(long id) {
        return memberRepository.findById(id);
    }

    @Override
    public Member updateByMember(long id, Member member) {
        return memberRepository.updateByid(id,member);
    }

    @Override
    public Member deleteByMember(long id) {
        return memberRepository.deleteById(id);
    }
}
