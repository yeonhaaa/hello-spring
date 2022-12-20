package com.yh.hellospring;

import com.yh.hellospring.repository.MemberRepository;
import com.yh.hellospring.repository.MemoryMemberRepository;
import com.yh.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
