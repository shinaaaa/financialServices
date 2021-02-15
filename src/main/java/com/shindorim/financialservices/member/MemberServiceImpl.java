package com.shindorim.financialservices.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원 가입
     *
     * @param member 회원할 회원 데이터
     */
    @Override
    public void save(Member member) {
        memberRepository.save(member);
    }

    /**
     * 회원 찾기
     *
     * @param id 회원 아이디
     * @return 회원 데이터
     */
    @Override
    public Optional<Member> findById(String id) {
        return memberRepository.findById(id);
    }

    /**
     * 전체 회원 추출
     *
     * @return 회원 리스트
     */
    @Override
    public List<Member> findAll() {
        return null;
    }
}
