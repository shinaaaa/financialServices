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
    public String open(Account account) {
        accountService.open(account);
        return "200";
    }

    @PostMapping("/account/rest")
    public String rest(Long memberNum, String accountNum) {
        accountService.resetPassWord(memberNum, accountNum);
        return "200";
    }

    @PostMapping("/account/findAccount")
    public Optional<Account> find(Long memberNum) {
        return accountService.findByMemberNum(memberNum);
    }
}
