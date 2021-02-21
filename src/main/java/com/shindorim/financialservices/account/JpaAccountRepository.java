package com.shindorim.financialservices.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
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
        entityManager.persist(account);
        return account;
    }

    @Override
    public Account resetPassWord(Long memberNum, String accountNum) {
        TypedQuery<Account> accountTypedQuery = entityManager
                .createQuery("update Account a set a.account_pw = 000 where a.member_num = :member_num and a.account_num = :account_num", Account.class)
                .setParameter("member_num", memberNum)
                .setParameter("account_num", accountNum);
        return accountTypedQuery.getSingleResult();
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
