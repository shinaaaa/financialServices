package com.shindorim.financialservices.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MemberController {

    private final MemberServiceImpl memberService;

    @Autowired
    public MemberController(MemberServiceImpl memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/member/join")
    public Member join(Member member) {
        return memberService.save(member);
    }

    @PostMapping("/member/find")
    public Optional<Member> find(String id) {
        return memberService.findById(id);
    }

}
