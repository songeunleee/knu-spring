package com.example.management.member;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Repository
public class TempMemberRepository implements MemberRepository{

    private final List<Member> list = new ArrayList<>();

    @Override
    public long save(Member member) {
        list.add(member);
        print();
        return member.getId();
    }


    void print(){
        System.out.println("list = {");
        for(Member m : list){
            System.out.println("id = " + m.getId() + " name = " + m.getName() + " grade = " + m.getGrade() );
        }
        System.out.println("}");
    }
    @Override
    public Member findById(long id) {
        System.out.println(list.stream().filter(member-> id == member.getId()).findAny().orElse(null).getName());
        return list.stream().filter(member-> id == member.getId()).findAny().orElse(null);
    }

    @Override
    public Member updateByid(long id,Member member) {
        int index = list.indexOf(findById(id));
        System.out.println("업데이트 전 " + list.get(index).getName());
        list.get(index).setId(member.getId());
        list.get(index).setName(member.getName());
        list.get(index).setGrade(member.getGrade());
        System.out.println("업데이트 후 " + list.get(index).getName());
        print();
        return list.get(index);
    }

    @Override
    public Member deleteById(long id) {
        int index = list.indexOf(findById(id));
        return list.remove(index);
    }


}
