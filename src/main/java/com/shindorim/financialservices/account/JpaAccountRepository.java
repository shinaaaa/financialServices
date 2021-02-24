package com.shindorim.financialservices.account;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Component
public class JpaAccountRepository implements AccountRepository {
    private final EntityManager entityManager;

    public JpaAccountRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Account open(Account account) {

        Query member_num = entityManager.createQuery("select m.member_num from Member m where m.member_num = :member_num")
                .setParameter("member_num", account.getMember_num());
        if (member_num != null) {
            entityManager.persist(account);
            return account;
        } else {
            return null;
        }
    }

    @Override
    public String resetPassWord(Long member_num, String account_num) {
        int resultCount = entityManager
                .createQuery("update Account a set a.account_pw = 0 where a.member_num = :member_num and a.account_num = :account_num")
                .setParameter("member_num", member_num)
                .setParameter("account_num", account_num)
                .executeUpdate();
        return (resultCount == 0 ? "fail" : "success");
    }

    @Override
    public Optional<Account> findByMemberNum(Long memberNum) {
        return Optional.empty();
    }

    @Override
    public List<Account> findAllAccount() {
        return null;
    }
}
