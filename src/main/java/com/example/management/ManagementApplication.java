package com.example.management;

import com.example.management.config.AppConfig;
import com.example.management.member.Grade;
import com.example.management.member.Member;
import com.example.management.member.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(ManagementApplication.class, args);

        Member member = new Member(123,"이송은", "VIP");
      //  AppConfig appConfig = new AppConfig();

       // MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);




    }

}
