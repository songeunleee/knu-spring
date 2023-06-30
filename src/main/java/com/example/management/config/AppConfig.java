package com.example.management.config;

import com.example.management.member.MemberRepository;
import com.example.management.member.MemberService;
import com.example.management.member.MemberServiceImpl;
import com.example.management.member.TempMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new TempMemberRepository();
    }

}
