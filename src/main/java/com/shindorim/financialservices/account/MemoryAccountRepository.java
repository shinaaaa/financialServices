package com.shindorim.financialservices.account;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryAccountRepository implements AccountRepository {

    private static final Map<Long, Account> store = new ConcurrentHashMap<>();

    @Override
    public void open(Account account) {
        store.put(account.getMemberNum(), account);
    }

    @Override
    public void resetPassWord(Long memberNum, String accountNum) {
        Account oldAccount = store.get(memberNum);
        Account newAccount = store.get(memberNum);
        newAccount.setAccountPw(0);
        store.replace(memberNum, oldAccount, newAccount);
    }

    @Override
    public Optional<Account> findByMemberNum(Long memberNum) {
        return Optional.ofNullable(store.get(memberNum));
    }

    @Override
    public List<Account> findAllAccount() {
        return null;
    }
}
