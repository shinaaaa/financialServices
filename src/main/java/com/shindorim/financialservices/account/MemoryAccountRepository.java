package com.shindorim.financialservices.account;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryAccountRepository implements AccountRepository {

    private static final Map<Long, Account> store = new ConcurrentHashMap<>();

    @Override
    public Account open(Account account) {
        store.put(account.getMember_num(), account);
        return account;
    }

    @Override
    public Account resetPassWord(Long memberNum, String accountNum) {
        Account oldAccount = store.get(memberNum);
        Account newAccount = store.get(memberNum);
        newAccount.setAccount_pw(0);
        store.replace(memberNum, oldAccount, newAccount);
        return newAccount;
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
