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

    @PostMapping("/join")
    public String join(Member member) {
        System.out.println("member = " + member.toString());
        memberService.save(member);
        return "200";
    }

    @PostMapping("/find")
    public Optional<Member> find(String id) {
        System.out.println("id = " + id);
        return memberService.findById(id);
    }

}
