package com.shindorim.financialservices.account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    void open(Account account);

    void resetPassWord(Long memberNum, String accountNum);

    Optional<Account> findByMemberNum(Long memberNum);

    List<Account> findAllAccount();
}
