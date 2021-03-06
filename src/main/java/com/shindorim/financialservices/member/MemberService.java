package com.shindorim.financialservices.member;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    Member save(Member member);

    Optional<Member> findById(String id);

    List<Member> findAll();
}
