package com.shindorim.financialservices.member;

import com.shindorim.financialservices.AppConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    void BeforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    @DisplayName("회원 가입")
    void save() {
        Member member = new Member(1000L, "member1", "홍길동", "01012345678", "12345");
        memberService.save(member);

        Optional<Member> findMember = memberService.findById("member1");

        assertThat(findMember.get()).isEqualTo(member);
    }
}