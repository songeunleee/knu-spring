package com.example.management.member;

import java.util.ArrayList;
import java.util.List;

public interface MemberRepository {
     public long save(Member member);
     public Member findById(long id);

     public Member updateByid(long id,Member member);
     public Member deleteById(long id);

}
