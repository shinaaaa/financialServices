package com.shindorim.financialservices.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AccountController {

    private final AccountServiceImpl accountService;

    @Autowired
    public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/account/open")
    public Account open(Account account) {
        return accountService.open(account);
    }

    @PostMapping("/account/rest")
    public String rest(Long member_num, String account_num) {
        return accountService.resetPassWord(member_num, account_num);
    }

    @PostMapping("/account/findAccount")
    public Optional<Account> find(Long memberNum) {
        return accountService.findByMemberNum(memberNum);
    }
}
