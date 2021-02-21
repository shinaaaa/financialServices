package com.shindorim.financialservices.account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    Account open(Account account);

    String resetPassWord(Long member_num, String account_num);

    Optional<Account> findByMemberNum(Long memberNum);

    List<Account> findAllAccount();
}
