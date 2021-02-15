package com.shindorim.financialservices.member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    void save(Member member);

    Optional<Member> findById(String id);

    Optional<Member> findByName(String name);

    List<Member> findAll();

}
