package com.example.management.member;


public interface MemberService {

     public long join(Member member);
     public Member findByMember(long id);
     public Member updateByMember(long id,Member member);
     public Member deleteByMember(long id);

}
